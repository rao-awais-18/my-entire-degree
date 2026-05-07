import socket

def scan_ports(target_ip, ports):
    print(f"Scanning {target_ip}...")
    for port in ports:
        sock = socket.socket(socket.AF_INET, socket.SOCK_STREAM)
        sock.settimeout(0.5)
        result = sock.connect_ex((target_ip, port))
        if result == 0:
            print(f"Port {port}: Open")
        else:
            print(f"Port {port}: Closed")
        sock.close()

if __name__ == "__main__":
    # Scan localhost
    scan_ports("127.0.0.1", [80, 443, 12345])
