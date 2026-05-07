import socket

HOST = '127.0.0.1'
PORT = 5001

server = socket.socket()
server.bind((HOST, PORT))
server.listen(1)

print("Waiting for connection...")

conn, addr = server.accept()
print(f"Connected with {addr}")

file = open("received_file.txt", "wb")

while True:
    data = conn.recv(1024)
    if not data:
        break
    file.write(data)

file.close()
conn.close()
print("File received successfully")