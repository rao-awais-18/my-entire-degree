import socket

def receive_file():
    s = socket.socket(socket.AF_INET, socket.SOCK_DGRAM)
    s.bind(("localhost", 9999))
    
    filename, addr = s.recvfrom(1024)
    print(f"Receiving {filename.decode()}...")
    
    with open("received_" + filename.decode(), "wb") as f:
        try:
            while True:
                s.settimeout(2)
                data, addr = s.recvfrom(1024)
                f.write(data)
        except socket.timeout:
            print("Transfer Complete")
            
    s.close()

if __name__ == "__main__":
    receive_file()
