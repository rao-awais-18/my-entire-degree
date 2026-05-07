def checksum(data):
    # Simple XOR checksum
    c = 0
    for byte in data.encode():
        c ^= byte
    return c

if __name__ == "__main__":
    msg = "Hello Network"
    cs = checksum(msg)
    print(f"Checksum for '{msg}': {cs}")
    
    # Verification
    if checksum(msg) == cs:
        print("Data is valid")
    else:
        print("Data corrupted")
