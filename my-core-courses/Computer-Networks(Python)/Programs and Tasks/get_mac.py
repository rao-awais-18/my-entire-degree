import uuid

def get_mac():
    mac = uuid.getnode()
    return ':'.join(('%012X' % mac)[i:i+2] for i in range(0, 12, 2))

if __name__ == "__main__":
    print(f"Your MAC Address: {get_mac()}")
