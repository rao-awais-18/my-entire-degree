import socket

HOST = '127.0.0.1'
PORT = 5001

client = socket.socket()
client.connect((HOST, PORT))

file = open("sample.txt", "rb")
data = file.read(1024)

while data:
    client.send(data)
    data = file.read(1024)

file.close()
client.close()

print("File sent successfully")