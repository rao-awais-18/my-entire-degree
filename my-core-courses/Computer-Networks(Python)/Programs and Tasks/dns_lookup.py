import socket

def nslookup(domain):
    try:
        ip = socket.gethostbyname(domain)
        print(f"{domain} -> {ip}")
    except:
        print("Could not resolve domain.")

if __name__ == "__main__":
    nslookup("google.com")
    nslookup("github.com")
