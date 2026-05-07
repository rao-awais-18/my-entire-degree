import socket

ip = input("Enter target IP: ")

start_port = int(input("Enter start port: "))
end_port = int(input("Enter end port: "))

print(f"Scanning {ip}...")

for port in range(start_port, end_port + 1):
    sock = socket.socket(socket.AF_INET, socket.SOCK_STREAM)
    sock.settimeout(0.5)

    result = sock.connect_ex((ip, port))

    if result == 0:
        print(f"Port {port} is OPEN")

    sock.close()

print("Scanning completed")