import time
import random

def sender():
    frames = 5
    i = 1
    while i <= frames:
        print(f"Sending Frame {i}...")
        # Simulate ack loss or success
        ack = random.choice([True, False])
        time.sleep(0.5)
        
        if ack:
            print(f"Ack received for Frame {i}")
            i += 1
        else:
            print(f"Ack lost/timeout for Frame {i}. Resending...")

if __name__ == "__main__":
    sender()
