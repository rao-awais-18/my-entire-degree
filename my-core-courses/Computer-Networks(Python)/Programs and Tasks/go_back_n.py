import time

def go_back_n(total_frames, window_size):
    sent = 0
    while sent < total_frames:
        for i in range(window_size):
            if sent + i < total_frames:
                print(f"Sending Frame {sent + i}")
                time.sleep(0.1)
                
        # Simulating ACK for the window
        # In simulation assume always success for simplicity
        print(f"Ack received for window starting {sent}")
        sent += window_size

if __name__ == "__main__":
    go_back_n(10, 4)
