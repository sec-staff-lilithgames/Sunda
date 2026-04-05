package com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.LinkedList;
import java.util.Queue;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final BufferedReader f24851a;

    /* renamed from: b, reason: collision with root package name */
    public final Queue f24852b;

    /* renamed from: c, reason: collision with root package name */
    public String f24853c;

    public f(LinkedList linkedList, BufferedReader bufferedReader) {
        this.f24852b = linkedList;
        this.f24851a = bufferedReader;
    }

    public final boolean a() throws IOException {
        String strTrim;
        if (this.f24853c != null) {
            return true;
        }
        if (!this.f24852b.isEmpty()) {
            this.f24853c = (String) this.f24852b.poll();
            return true;
        }
        do {
            String line = this.f24851a.readLine();
            this.f24853c = line;
            if (line == null) {
                return false;
            }
            strTrim = line.trim();
            this.f24853c = strTrim;
        } while (strTrim.isEmpty());
        return true;
    }
}
