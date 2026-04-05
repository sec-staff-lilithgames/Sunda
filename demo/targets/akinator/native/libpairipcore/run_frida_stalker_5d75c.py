#!/usr/bin/env python3
import argparse
import json
import sys
import time
from pathlib import Path

import frida


SCRIPT_PATH = Path("/Users/siberia/Desktop/akinator/so-info/libpairipcore/frida_stalker_5d75c.js")


def main():
    ap = argparse.ArgumentParser()
    ap.add_argument("--device", default="usb", choices=["usb", "remote"])
    ap.add_argument("--remote-host", default="127.0.0.1:27042")
    ap.add_argument("--mode", required=True, choices=["attach", "spawn"])
    ap.add_argument("--pid", type=int)
    ap.add_argument("--package", default="com.digidust.elokence.akinator.freemium")
    ap.add_argument("--seconds", type=float, default=6.0)
    ap.add_argument("--out", required=True)
    args = ap.parse_args()

    if args.device == "usb":
        dev = frida.get_usb_device(timeout=5)
    else:
        dev = frida.get_device_manager().add_remote_device(args.remote_host)

    if args.mode == "attach":
        if args.pid is None:
            ap.error("--pid is required in attach mode")
        pid = args.pid
    else:
        pid = dev.spawn([args.package])

    session = dev.attach(pid)
    messages = []

    def on_message(message, data):
        messages.append(message)
        if message["type"] == "send":
            print(json.dumps(message["payload"], ensure_ascii=False), flush=True)
        else:
            print(json.dumps(message, ensure_ascii=False), flush=True)

    script = session.create_script(SCRIPT_PATH.read_text())
    script.on("message", on_message)
    script.load()

    if args.mode == "spawn":
        dev.resume(pid)

    time.sleep(args.seconds)
    result = script.exports_sync.stop()

    out = {
        "mode": args.mode,
        "pid": pid,
        "messages": messages,
        "result": result,
    }
    Path(args.out).write_text(json.dumps(out, ensure_ascii=False, indent=2))

    try:
      session.detach()
    except Exception:
      pass


if __name__ == "__main__":
    main()
