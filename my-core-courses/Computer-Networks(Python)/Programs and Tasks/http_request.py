import http.client

def get_example_com():
    conn = http.client.HTTPSConnection("www.example.com")
    conn.request("GET", "/")
    r1 = conn.getresponse()
    print(f"Status: {r1.status}, Reason: {r1.reason}")
    data = r1.read()
    print("Data received (first 100 bytes):")
    print(data[:100])

if __name__ == "__main__":
    get_example_com()
