package io.odeeo.internal.n;

import io.ktor.util.date.GMTDateParser;
import io.odeeo.internal.b.g0;
import io.odeeo.internal.g.u;
import io.odeeo.internal.q0.x;
import io.odeeo.internal.s.a;
import io.odeeo.internal.t0.z;
import io.odeeo.internal.y.c;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class i {

    /* renamed from: d, reason: collision with root package name */
    public static final z f64853d = z.on(AbstractJsonLexerKt.COLON);

    /* renamed from: e, reason: collision with root package name */
    public static final z f64854e = z.on(GMTDateParser.ANY);

    /* renamed from: a, reason: collision with root package name */
    public final List<a> f64855a = new ArrayList();

    /* renamed from: b, reason: collision with root package name */
    public int f64856b = 0;

    /* renamed from: c, reason: collision with root package name */
    public int f64857c;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final int f64858a;

        /* renamed from: b, reason: collision with root package name */
        public final long f64859b;

        /* renamed from: c, reason: collision with root package name */
        public final int f64860c;

        public a(int i10, long j10, int i11) {
            this.f64858a = i10;
            this.f64859b = j10;
            this.f64860c = i11;
        }
    }

    public final void a(io.odeeo.internal.g.i iVar, u uVar) throws IOException {
        x xVar = new x(8);
        iVar.readFully(xVar.getData(), 0, 8);
        this.f64857c = xVar.readLittleEndianInt() + 8;
        if (xVar.readInt() != 1397048916) {
            uVar.f64171a = 0L;
        } else {
            uVar.f64171a = iVar.getPosition() - (this.f64857c - 12);
            this.f64856b = 2;
        }
    }

    public final void b(io.odeeo.internal.g.i iVar, u uVar) throws IOException {
        long length = iVar.getLength();
        int i10 = this.f64857c - 20;
        x xVar = new x(i10);
        iVar.readFully(xVar.getData(), 0, i10);
        for (int i11 = 0; i11 < i10 / 12; i11++) {
            xVar.skipBytes(2);
            short littleEndianShort = xVar.readLittleEndianShort();
            if (littleEndianShort == 2192 || littleEndianShort == 2816 || littleEndianShort == 2817 || littleEndianShort == 2819 || littleEndianShort == 2820) {
                this.f64855a.add(new a(littleEndianShort, (length - this.f64857c) - xVar.readLittleEndianInt(), xVar.readLittleEndianInt()));
            } else {
                xVar.skipBytes(8);
            }
        }
        if (this.f64855a.isEmpty()) {
            uVar.f64171a = 0L;
        } else {
            this.f64856b = 3;
            uVar.f64171a = this.f64855a.get(0).f64859b;
        }
    }

    public int read(io.odeeo.internal.g.i iVar, u uVar, List<a.b> list) throws IOException {
        int i10 = this.f64856b;
        long j10 = 0;
        if (i10 == 0) {
            long length = iVar.getLength();
            if (length != -1 && length >= 8) {
                j10 = length - 8;
            }
            uVar.f64171a = j10;
            this.f64856b = 1;
        } else if (i10 == 1) {
            a(iVar, uVar);
        } else if (i10 == 2) {
            b(iVar, uVar);
        } else {
            if (i10 != 3) {
                throw new IllegalStateException();
            }
            a(iVar, list);
            uVar.f64171a = 0L;
        }
        return 1;
    }

    public void reset() {
        this.f64855a.clear();
        this.f64856b = 0;
    }

    public final void a(io.odeeo.internal.g.i iVar, List<a.b> list) throws IOException {
        long position = iVar.getPosition();
        int length = (int) ((iVar.getLength() - iVar.getPosition()) - this.f64857c);
        x xVar = new x(length);
        iVar.readFully(xVar.getData(), 0, length);
        for (int i10 = 0; i10 < this.f64855a.size(); i10++) {
            a aVar = this.f64855a.get(i10);
            xVar.setPosition((int) (aVar.f64859b - position));
            xVar.skipBytes(4);
            int littleEndianInt = xVar.readLittleEndianInt();
            int iA = a(xVar.readString(littleEndianInt));
            int i11 = aVar.f64860c - (littleEndianInt + 8);
            if (iA == 2192) {
                list.add(a(xVar, i11));
            } else if (iA != 2816 && iA != 2817 && iA != 2819 && iA != 2820) {
                throw new IllegalStateException();
            }
        }
    }

    public static io.odeeo.internal.y.c a(x xVar, int i10) throws g0 {
        ArrayList arrayList = new ArrayList();
        List<String> listSplitToList = f64854e.splitToList(xVar.readString(i10));
        for (int i11 = 0; i11 < listSplitToList.size(); i11++) {
            List<String> listSplitToList2 = f64853d.splitToList(listSplitToList.get(i11));
            if (listSplitToList2.size() == 3) {
                try {
                    arrayList.add(new c.b(Long.parseLong(listSplitToList2.get(0)), Long.parseLong(listSplitToList2.get(1)), 1 << (Integer.parseInt(listSplitToList2.get(2)) - 1)));
                } catch (NumberFormatException e10) {
                    throw g0.createForMalformedContainer(null, e10);
                }
            } else {
                throw g0.createForMalformedContainer(null, null);
            }
        }
        return new io.odeeo.internal.y.c(arrayList);
    }

    public static int a(String str) throws g0 {
        str.getClass();
        switch (str) {
            case "SlowMotion_Data":
                return 2192;
            case "Super_SlowMotion_Edit_Data":
                return 2819;
            case "Super_SlowMotion_Data":
                return 2816;
            case "Super_SlowMotion_Deflickering_On":
                return 2820;
            case "Super_SlowMotion_BGM":
                return 2817;
            default:
                throw g0.createForMalformedContainer("Invalid SEF name", null);
        }
    }
}
