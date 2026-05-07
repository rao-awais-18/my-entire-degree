import socket

def send_file():
    s = socket.socket(socket.AF_INET, socket.SOCK_DGRAM)
    addr = ("localhost", 9999)
    filename = "test_file.txt"
    
    # Create dummy file
    with open(filename, "w") as f: f.write("This is a test file content.")

    s.sendto(filename.encode(), addr)
    with open(filename, "rb") as f:
        data = f.read(1024)
        while data:
            if s.sendto(data, addr):
                print("sending...")
                data = f.read(1024)
    s.close()

if __name__ == "__main__":
    send_file()
