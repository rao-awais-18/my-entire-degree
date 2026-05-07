import socket
import threading

clients = []

def broadcast(message, _client):
    for client in clients:
        if client != _client:
            try:
                client.send(message)
            except:
                clients.remove(client)

def handle_client(client):
    while True:
        try:
            message = client.recv(1024)
            broadcast(message, client)
        except:
            clients.remove(client)
            client.close()
            break

def receive():
    server = socket.socket(socket.AF_INET, socket.SOCK_STREAM)
    server.bind(('localhost', 55555))
    server.listen()
    print("Server running...")

    while True:
        client, address = server.accept()
        print(f"Connected with {str(address)}")
        clients.append(client)
        threading.Thread(target=handle_client, args=(client,)).start()

if __name__ == "__main__":
    receive()
