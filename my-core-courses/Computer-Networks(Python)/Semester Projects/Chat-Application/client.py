import socket
import threading

def receive(client):
    while True:
        try:
            message = client.recv(1024).decode('ascii')
            print(message)
        except:
            print("An error occurred!")
            client.close()
            break

def write(client):
    while True:
        message = f'{input("")}'
        client.send(message.encode('ascii'))

client = socket.socket(socket.AF_INET, socket.SOCK_STREAM)
client.connect(('localhost', 55555))

receive_thread = threading.Thread(target=receive, args=(client,))
receive_thread.start()

write_thread = threading.Thread(target=write, args=(client,))
write_thread.start()
