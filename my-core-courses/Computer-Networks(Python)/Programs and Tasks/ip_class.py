def find_class(ip):
    first_octet = int(ip.split('.')[0])
    
    if 0 <= first_octet <= 127:
        return "Class A"
    elif 128 <= first_octet <= 191:
        return "Class B"
    elif 192 <= first_octet <= 223:
        return "Class C"
    elif 224 <= first_octet <= 239:
        return "Class D (Multicast)"
    else:
        return "Class E (Experimental)"

if __name__ == "__main__":
    print(find_class("192.168.1.1"))
    print(find_class("10.0.0.1"))
