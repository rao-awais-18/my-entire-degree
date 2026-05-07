from http.server import HTTPServer, BaseHTTPRequestHandler

class SimpleHandler(BaseHTTPRequestHandler):
    def do_GET(self):
        self.send_response(200)
        self.end_headers()
        self.wfile.write(b"Hello from Python Web Server")

if __name__ == "__main__":
    server = HTTPServer(('localhost', 8000), SimpleHandler)
    print("Serving on port 8000...")
    server.serve_forever()
