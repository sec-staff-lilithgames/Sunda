package xi;

import com.ironsource.C3191e4;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import j1.o2;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class g implements ui.g {

    /* renamed from: f, reason: collision with root package name */
    public static final Charset f92005f = Charset.forName(C.UTF8_NAME);

    /* renamed from: g, reason: collision with root package name */
    public static final ui.e f92006g = o2.s(1, ui.e.builder(C3191e4.h.W));

    /* renamed from: h, reason: collision with root package name */
    public static final ui.e f92007h = o2.s(2, ui.e.builder("value"));

    /* renamed from: i, reason: collision with root package name */
    public static final wi.a f92008i = new wi.a(1);

    /* renamed from: a, reason: collision with root package name */
    public OutputStream f92009a;

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f92010b;

    /* renamed from: c, reason: collision with root package name */
    public final HashMap f92011c;

    /* renamed from: d, reason: collision with root package name */
    public final ui.f f92012d;

    /* renamed from: e, reason: collision with root package name */
    public final j f92013e = new j(this);

    public g(OutputStream outputStream, HashMap map, HashMap map2, ui.f fVar) {
        this.f92009a = outputStream;
        this.f92010b = map;
        this.f92011c = map2;
        this.f92012d = fVar;
    }

    public static int h(ui.e eVar) {
        f fVar = (f) eVar.getProperty(f.class);
        if (fVar != null) {
            return ((a) fVar).tag();
        }
        throw new ui.c("Field has no @Protobuf config");
    }

    public final g a(ui.e eVar, Object obj, boolean z10) throws IOException {
        if (obj != null) {
            if (obj instanceof CharSequence) {
                CharSequence charSequence = (CharSequence) obj;
                if (!z10 || charSequence.length() != 0) {
                    i((h(eVar) << 3) | 2);
                    byte[] bytes = charSequence.toString().getBytes(f92005f);
                    i(bytes.length);
                    this.f92009a.write(bytes);
                    return this;
                }
            } else if (obj instanceof Collection) {
                Iterator it = ((Collection) obj).iterator();
                while (it.hasNext()) {
                    a(eVar, it.next(), false);
                }
            } else if (obj instanceof Map) {
                Iterator it2 = ((Map) obj).entrySet().iterator();
                while (it2.hasNext()) {
                    f(f92008i, eVar, (Map.Entry) it2.next(), false);
                }
            } else {
                if (obj instanceof Double) {
                    b(eVar, ((Double) obj).doubleValue(), z10);
                    return this;
                }
                if (obj instanceof Float) {
                    c(eVar, ((Float) obj).floatValue(), z10);
                    return this;
                }
                if (obj instanceof Number) {
                    e(eVar, ((Number) obj).longValue(), z10);
                    return this;
                }
                if (obj instanceof Boolean) {
                    d(eVar, ((Boolean) obj).booleanValue() ? 1 : 0, z10);
                    return this;
                }
                if (!(obj instanceof byte[])) {
                    ui.f fVar = (ui.f) this.f92010b.get(obj.getClass());
                    if (fVar != null) {
                        f(fVar, eVar, obj, z10);
                        return this;
                    }
                    ui.h hVar = (ui.h) this.f92011c.get(obj.getClass());
                    if (hVar != null) {
                        j jVar = this.f92013e;
                        jVar.f92021a = false;
                        jVar.f92023c = eVar;
                        jVar.f92022b = z10;
                        hVar.encode(obj, jVar);
                        return this;
                    }
                    if (obj instanceof d) {
                        return add(eVar, ((d) obj).getNumber());
                    }
                    if (obj instanceof Enum) {
                        return add(eVar, ((Enum) obj).ordinal());
                    }
                    f(this.f92012d, eVar, obj, z10);
                    return this;
                }
                byte[] bArr = (byte[]) obj;
                if (!z10 || bArr.length != 0) {
                    i((h(eVar) << 3) | 2);
                    i(bArr.length);
                    this.f92009a.write(bArr);
                    return this;
                }
            }
        }
        return this;
    }

    public final void b(ui.e eVar, double d10, boolean z10) throws IOException {
        if (z10 && d10 == 0.0d) {
            return;
        }
        i((h(eVar) << 3) | 1);
        this.f92009a.write(ByteBuffer.allocate(8).order(ByteOrder.LITTLE_ENDIAN).putDouble(d10).array());
    }

    public final void c(ui.e eVar, float f10, boolean z10) throws IOException {
        if (z10 && f10 == 0.0f) {
            return;
        }
        i((h(eVar) << 3) | 5);
        this.f92009a.write(ByteBuffer.allocate(4).order(ByteOrder.LITTLE_ENDIAN).putFloat(f10).array());
    }

    public final void d(ui.e eVar, int i10, boolean z10) throws IOException {
        if (z10 && i10 == 0) {
            return;
        }
        f fVar = (f) eVar.getProperty(f.class);
        if (fVar == null) {
            throw new ui.c("Field has no @Protobuf config");
        }
        a aVar = (a) fVar;
        int iOrdinal = aVar.intEncoding().ordinal();
        if (iOrdinal == 0) {
            i(aVar.tag() << 3);
            i(i10);
        } else if (iOrdinal == 1) {
            i(aVar.tag() << 3);
            i((i10 << 1) ^ (i10 >> 31));
        } else {
            if (iOrdinal != 2) {
                return;
            }
            i((aVar.tag() << 3) | 5);
            this.f92009a.write(ByteBuffer.allocate(4).order(ByteOrder.LITTLE_ENDIAN).putInt(i10).array());
        }
    }

    public final void e(ui.e eVar, long j10, boolean z10) throws IOException {
        if (z10 && j10 == 0) {
            return;
        }
        f fVar = (f) eVar.getProperty(f.class);
        if (fVar == null) {
            throw new ui.c("Field has no @Protobuf config");
        }
        a aVar = (a) fVar;
        int iOrdinal = aVar.intEncoding().ordinal();
        if (iOrdinal == 0) {
            i(aVar.tag() << 3);
            j(j10);
        } else if (iOrdinal == 1) {
            i(aVar.tag() << 3);
            j((j10 >> 63) ^ (j10 << 1));
        } else {
            if (iOrdinal != 2) {
                return;
            }
            i((aVar.tag() << 3) | 1);
            this.f92009a.write(ByteBuffer.allocate(8).order(ByteOrder.LITTLE_ENDIAN).putLong(j10).array());
        }
    }

    public final void f(ui.f fVar, ui.e eVar, Object obj, boolean z10) throws IOException {
        c cVar = new c();
        cVar.f92002b = 0L;
        try {
            OutputStream outputStream = this.f92009a;
            this.f92009a = cVar;
            try {
                fVar.encode(obj, this);
                this.f92009a = outputStream;
                long j10 = cVar.f92002b;
                cVar.close();
                if (z10 && j10 == 0) {
                    return;
                }
                i((h(eVar) << 3) | 2);
                j(j10);
                fVar.encode(obj, this);
            } catch (Throwable th2) {
                this.f92009a = outputStream;
                throw th2;
            }
        } catch (Throwable th3) {
            try {
                cVar.close();
            } catch (Throwable th4) {
                th3.addSuppressed(th4);
            }
            throw th3;
        }
    }

    public final void g(Object obj) throws IOException {
        if (obj == null) {
            return;
        }
        ui.f fVar = (ui.f) this.f92010b.get(obj.getClass());
        if (fVar != null) {
            fVar.encode(obj, this);
        } else {
            throw new ui.c("No encoder for " + obj.getClass());
        }
    }

    public final void i(int i10) throws IOException {
        while ((i10 & (-128)) != 0) {
            this.f92009a.write((i10 & 127) | 128);
            i10 >>>= 7;
        }
        this.f92009a.write(i10 & 127);
    }

    @Override // ui.g
    public ui.g inline(Object obj) throws IOException {
        g(obj);
        return this;
    }

    public final void j(long j10) throws IOException {
        while (((-128) & j10) != 0) {
            this.f92009a.write((((int) j10) & 127) | 128);
            j10 >>>= 7;
        }
        this.f92009a.write(((int) j10) & 127);
    }

    @Override // ui.g
    public ui.g nested(String str) throws IOException {
        return nested(ui.e.of(str));
    }

    @Override // ui.g
    public ui.g nested(ui.e eVar) throws IOException {
        throw new ui.c("nested() is not implemented for protobuf encoding.");
    }

    @Override // ui.g
    public ui.g add(String str, Object obj) throws IOException {
        return add(ui.e.of(str), obj);
    }

    @Override // ui.g
    public ui.g add(String str, double d10) throws IOException {
        return add(ui.e.of(str), d10);
    }

    @Override // ui.g
    public ui.g add(String str, int i10) throws IOException {
        return add(ui.e.of(str), i10);
    }

    @Override // ui.g
    public ui.g add(String str, long j10) throws IOException {
        return add(ui.e.of(str), j10);
    }

    @Override // ui.g
    public ui.g add(String str, boolean z10) throws IOException {
        return add(ui.e.of(str), z10);
    }

    @Override // ui.g
    public ui.g add(ui.e eVar, Object obj) throws IOException {
        return a(eVar, obj, true);
    }

    @Override // ui.g
    public ui.g add(ui.e eVar, double d10) throws IOException {
        b(eVar, d10, true);
        return this;
    }

    @Override // ui.g
    public ui.g add(ui.e eVar, float f10) throws IOException {
        c(eVar, f10, true);
        return this;
    }

    @Override // ui.g
    public g add(ui.e eVar, int i10) throws IOException {
        d(eVar, i10, true);
        return this;
    }

    @Override // ui.g
    public g add(ui.e eVar, long j10) throws IOException {
        e(eVar, j10, true);
        return this;
    }

    @Override // ui.g
    public g add(ui.e eVar, boolean z10) throws IOException {
        d(eVar, z10 ? 1 : 0, true);
        return this;
    }
}
