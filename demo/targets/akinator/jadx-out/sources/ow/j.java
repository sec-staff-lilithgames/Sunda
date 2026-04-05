package ow;

import com.applovin.shadow.okhttp3.internal.ws.WebSocketProtocol;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.PsExtractor;
import java.io.Closeable;
import java.io.IOException;
import java.util.Random;
import kotlin.jvm.internal.e0;
import pw.g;
import pw.l;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class j implements Closeable {

    /* renamed from: b, reason: collision with root package name */
    public final boolean f79938b;

    /* renamed from: c, reason: collision with root package name */
    public final pw.j f79939c;

    /* renamed from: e, reason: collision with root package name */
    public final Random f79940e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f79941f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f79942g;

    /* renamed from: h, reason: collision with root package name */
    public final long f79943h;

    /* renamed from: i, reason: collision with root package name */
    public final pw.g f79944i;

    /* renamed from: j, reason: collision with root package name */
    public final pw.g f79945j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f79946k;

    /* renamed from: l, reason: collision with root package name */
    public a f79947l;

    /* renamed from: m, reason: collision with root package name */
    public final byte[] f79948m;

    /* renamed from: n, reason: collision with root package name */
    public final g.a f79949n;

    public j(boolean z10, pw.j sink, Random random, boolean z11, boolean z12, long j10) {
        e0.checkNotNullParameter(sink, "sink");
        e0.checkNotNullParameter(random, "random");
        this.f79938b = z10;
        this.f79939c = sink;
        this.f79940e = random;
        this.f79941f = z11;
        this.f79942g = z12;
        this.f79943h = j10;
        this.f79944i = new pw.g();
        this.f79945j = sink.getBuffer();
        this.f79948m = z10 ? new byte[4] : null;
        this.f79949n = z10 ? new g.a() : null;
    }

    public final void a(int i10, l lVar) throws IOException {
        if (this.f79946k) {
            throw new IOException("closed");
        }
        int size = lVar.size();
        if (size > 125) {
            throw new IllegalArgumentException("Payload size must be less than or equal to 125");
        }
        pw.g gVar = this.f79945j;
        gVar.writeByte(i10 | 128);
        if (this.f79938b) {
            gVar.writeByte(size | 128);
            byte[] bArr = this.f79948m;
            e0.checkNotNull(bArr);
            this.f79940e.nextBytes(bArr);
            gVar.write(bArr);
            if (size > 0) {
                long size2 = gVar.size();
                gVar.write(lVar);
                g.a aVar = this.f79949n;
                e0.checkNotNull(aVar);
                gVar.readAndWriteUnsafe(aVar);
                aVar.seek(size2);
                g.f79921a.toggleMask(aVar, bArr);
                aVar.close();
            }
        } else {
            gVar.writeByte(size);
            gVar.write(lVar);
        }
        this.f79939c.flush();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws Throwable {
        a aVar = this.f79947l;
        if (aVar != null) {
            aVar.close();
        }
    }

    public final Random getRandom() {
        return this.f79940e;
    }

    public final pw.j getSink() {
        return this.f79939c;
    }

    public final void writeClose(int i10, l lVar) throws IOException {
        l byteString = l.f81912g;
        if (i10 != 0 || lVar != null) {
            if (i10 != 0) {
                g.f79921a.validateCloseCode(i10);
            }
            pw.g gVar = new pw.g();
            gVar.writeShort(i10);
            if (lVar != null) {
                gVar.write(lVar);
            }
            byteString = gVar.readByteString();
        }
        try {
            a(8, byteString);
        } finally {
            this.f79946k = true;
        }
    }

    public final void writeMessageFrame(int i10, l data) throws IOException {
        e0.checkNotNullParameter(data, "data");
        if (this.f79946k) {
            throw new IOException("closed");
        }
        pw.g gVar = this.f79944i;
        gVar.write(data);
        int i11 = i10 | 128;
        if (this.f79941f && data.size() >= this.f79943h) {
            a aVar = this.f79947l;
            if (aVar == null) {
                aVar = new a(this.f79942g);
                this.f79947l = aVar;
            }
            aVar.deflate(gVar);
            i11 = i10 | PsExtractor.AUDIO_STREAM;
        }
        long size = gVar.size();
        pw.g gVar2 = this.f79945j;
        gVar2.writeByte(i11);
        boolean z10 = this.f79938b;
        int i12 = z10 ? 128 : 0;
        if (size <= 125) {
            gVar2.writeByte(i12 | ((int) size));
        } else if (size <= WebSocketProtocol.PAYLOAD_SHORT_MAX) {
            gVar2.writeByte(i12 | 126);
            gVar2.writeShort((int) size);
        } else {
            gVar2.writeByte(i12 | 127);
            gVar2.writeLong(size);
        }
        if (z10) {
            byte[] bArr = this.f79948m;
            e0.checkNotNull(bArr);
            this.f79940e.nextBytes(bArr);
            gVar2.write(bArr);
            if (size > 0) {
                g.a aVar2 = this.f79949n;
                e0.checkNotNull(aVar2);
                gVar.readAndWriteUnsafe(aVar2);
                aVar2.seek(0L);
                g.f79921a.toggleMask(aVar2, bArr);
                aVar2.close();
            }
        }
        gVar2.write(gVar, size);
        this.f79939c.emit();
    }

    public final void writePing(l payload) throws IOException {
        e0.checkNotNullParameter(payload, "payload");
        a(9, payload);
    }

    public final void writePong(l payload) throws IOException {
        e0.checkNotNullParameter(payload, "payload");
        a(10, payload);
    }
}
