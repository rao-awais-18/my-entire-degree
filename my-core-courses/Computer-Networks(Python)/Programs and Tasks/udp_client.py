import socket

def start_udp_client():
    sock = socket.socket(socket.AF_INET, socket.SOCK_DGRAM)
    message = "Hello UDP Server!"
    sock.sendto(message.encode(), ('localhost', 12345))
    print("Message sent")

if __name__ == "__main__":
    start_udp_client()
