import ipaddress

def calc_subnet(ip_net):
    try:
        net = ipaddress.ip_network(ip_net, strict=False)
        print(f"Network: {net}")
        print(f"Netmask: {net.netmask}")
        print(f"Hosts: {net.num_addresses - 2}") # -2 for net & broad
        print(f"Broadcast: {net.broadcast_address}")
    except ValueError:
        print("Invalid CIDR")

if __name__ == "__main__":
    calc_subnet("192.168.1.0/24")
