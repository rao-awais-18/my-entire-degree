import os

def ping(host):
    # This just runs a system command, wrapping it
    response = os.system("ping -n 1 " + host)
    if response == 0:
        print(f"{host} is up!")
    else:
        print(f"{host} is down!")

if __name__ == "__main__":
    ping("google.com")
