package io.odeeo.internal.n;

import android.util.Pair;
import android.util.SparseArray;
import androidx.core.app.NotificationCompat;
import com.inmobi.commons.core.configs.AdConfig;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.PsExtractor;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import com.moloco.sdk.BKC.KerkSviMAy;
import io.odeeo.internal.b.t;
import io.odeeo.internal.f.e;
import io.odeeo.internal.g.r;
import io.odeeo.internal.g.u;
import io.odeeo.internal.g.v;
import io.odeeo.internal.g.x;
import io.odeeo.internal.n.a;
import io.odeeo.internal.n.k;
import io.odeeo.internal.q0.e0;
import io.odeeo.internal.q0.g0;
import io.odeeo.internal.q0.p;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.UUID;
import p0.o2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public class e implements io.odeeo.internal.g.h {
    public static final io.odeeo.internal.g.l I = new bt.a(7);
    public static final byte[] J = {-94, 57, 79, 82, 90, -101, 79, 20, -94, 68, 108, 66, 124, 100, -115, -12};
    public static final t K = new t.b().setSampleMimeType(MimeTypes.APPLICATION_EMSG).build();
    public int A;
    public int B;
    public int C;
    public boolean D;
    public io.odeeo.internal.g.j E;
    public x[] F;
    public x[] G;
    public boolean H;

    /* renamed from: a, reason: collision with root package name */
    public final int f64779a;

    /* renamed from: b, reason: collision with root package name */
    public final k f64780b;

    /* renamed from: c, reason: collision with root package name */
    public final List<t> f64781c;

    /* renamed from: d, reason: collision with root package name */
    public final SparseArray<b> f64782d;

    /* renamed from: e, reason: collision with root package name */
    public final io.odeeo.internal.q0.x f64783e;

    /* renamed from: f, reason: collision with root package name */
    public final io.odeeo.internal.q0.x f64784f;

    /* renamed from: g, reason: collision with root package name */
    public final io.odeeo.internal.q0.x f64785g;

    /* renamed from: h, reason: collision with root package name */
    public final byte[] f64786h;

    /* renamed from: i, reason: collision with root package name */
    public final io.odeeo.internal.q0.x f64787i;

    /* renamed from: j, reason: collision with root package name */
    public final e0 f64788j;

    /* renamed from: k, reason: collision with root package name */
    public final io.odeeo.internal.u.c f64789k;

    /* renamed from: l, reason: collision with root package name */
    public final io.odeeo.internal.q0.x f64790l;

    /* renamed from: m, reason: collision with root package name */
    public final ArrayDeque<a.C0622a> f64791m;

    /* renamed from: n, reason: collision with root package name */
    public final ArrayDeque<a> f64792n;

    /* renamed from: o, reason: collision with root package name */
    public final x f64793o;

    /* renamed from: p, reason: collision with root package name */
    public int f64794p;

    /* renamed from: q, reason: collision with root package name */
    public int f64795q;

    /* renamed from: r, reason: collision with root package name */
    public long f64796r;

    /* renamed from: s, reason: collision with root package name */
    public int f64797s;

    /* renamed from: t, reason: collision with root package name */
    public io.odeeo.internal.q0.x f64798t;

    /* renamed from: u, reason: collision with root package name */
    public long f64799u;

    /* renamed from: v, reason: collision with root package name */
    public int f64800v;

    /* renamed from: w, reason: collision with root package name */
    public long f64801w;

    /* renamed from: x, reason: collision with root package name */
    public long f64802x;

    /* renamed from: y, reason: collision with root package name */
    public long f64803y;

    /* renamed from: z, reason: collision with root package name */
    public b f64804z;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final long f64805a;

        /* renamed from: b, reason: collision with root package name */
        public final int f64806b;

        public a(long j10, int i10) {
            this.f64805a = j10;
            this.f64806b = i10;
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public final x f64807a;

        /* renamed from: d, reason: collision with root package name */
        public n f64810d;

        /* renamed from: e, reason: collision with root package name */
        public c f64811e;

        /* renamed from: f, reason: collision with root package name */
        public int f64812f;

        /* renamed from: g, reason: collision with root package name */
        public int f64813g;

        /* renamed from: h, reason: collision with root package name */
        public int f64814h;

        /* renamed from: i, reason: collision with root package name */
        public int f64815i;

        /* renamed from: l, reason: collision with root package name */
        public boolean f64818l;

        /* renamed from: b, reason: collision with root package name */
        public final m f64808b = new m();

        /* renamed from: c, reason: collision with root package name */
        public final io.odeeo.internal.q0.x f64809c = new io.odeeo.internal.q0.x();

        /* renamed from: j, reason: collision with root package name */
        public final io.odeeo.internal.q0.x f64816j = new io.odeeo.internal.q0.x(1);

        /* renamed from: k, reason: collision with root package name */
        public final io.odeeo.internal.q0.x f64817k = new io.odeeo.internal.q0.x();

        public b(x xVar, n nVar, c cVar) {
            this.f64807a = xVar;
            this.f64810d = nVar;
            this.f64811e = cVar;
            reset(nVar, cVar);
        }

        public int getCurrentSampleFlags() {
            int i10 = !this.f64818l ? this.f64810d.f64902g[this.f64812f] : this.f64808b.f64888k[this.f64812f] ? 1 : 0;
            return getEncryptionBoxIfEncrypted() != null ? i10 | 1073741824 : i10;
        }

        public long getCurrentSampleOffset() {
            return !this.f64818l ? this.f64810d.f64898c[this.f64812f] : this.f64808b.f64884g[this.f64814h];
        }

        public long getCurrentSamplePresentationTimeUs() {
            return !this.f64818l ? this.f64810d.f64901f[this.f64812f] : this.f64808b.getSamplePresentationTimeUs(this.f64812f);
        }

        public int getCurrentSampleSize() {
            return !this.f64818l ? this.f64810d.f64899d[this.f64812f] : this.f64808b.f64886i[this.f64812f];
        }

        public l getEncryptionBoxIfEncrypted() {
            if (!this.f64818l) {
                return null;
            }
            int i10 = ((c) g0.castNonNull(this.f64808b.f64878a)).f64769a;
            l sampleDescriptionEncryptionBox = this.f64808b.f64891n;
            if (sampleDescriptionEncryptionBox == null) {
                sampleDescriptionEncryptionBox = this.f64810d.f64896a.getSampleDescriptionEncryptionBox(i10);
            }
            if (sampleDescriptionEncryptionBox == null || !sampleDescriptionEncryptionBox.f64873a) {
                return null;
            }
            return sampleDescriptionEncryptionBox;
        }

        public boolean next() {
            this.f64812f++;
            if (!this.f64818l) {
                return false;
            }
            int i10 = this.f64813g + 1;
            this.f64813g = i10;
            int[] iArr = this.f64808b.f64885h;
            int i11 = this.f64814h;
            if (i10 != iArr[i11]) {
                return true;
            }
            this.f64814h = i11 + 1;
            this.f64813g = 0;
            return false;
        }

        public int outputSampleEncryptionData(int i10, int i11) {
            io.odeeo.internal.q0.x xVar;
            l encryptionBoxIfEncrypted = getEncryptionBoxIfEncrypted();
            if (encryptionBoxIfEncrypted == null) {
                return 0;
            }
            int length = encryptionBoxIfEncrypted.f64876d;
            if (length != 0) {
                xVar = this.f64808b.f64892o;
            } else {
                byte[] bArr = (byte[]) g0.castNonNull(encryptionBoxIfEncrypted.f64877e);
                this.f64817k.reset(bArr, bArr.length);
                io.odeeo.internal.q0.x xVar2 = this.f64817k;
                length = bArr.length;
                xVar = xVar2;
            }
            boolean zSampleHasSubsampleEncryptionTable = this.f64808b.sampleHasSubsampleEncryptionTable(this.f64812f);
            boolean z10 = zSampleHasSubsampleEncryptionTable || i11 != 0;
            this.f64816j.getData()[0] = (byte) ((z10 ? 128 : 0) | length);
            this.f64816j.setPosition(0);
            this.f64807a.sampleData(this.f64816j, 1, 1);
            this.f64807a.sampleData(xVar, length, 1);
            if (!z10) {
                return length + 1;
            }
            if (!zSampleHasSubsampleEncryptionTable) {
                this.f64809c.reset(8);
                byte[] data = this.f64809c.getData();
                data[0] = 0;
                data[1] = 1;
                data[2] = (byte) ((i11 >> 8) & 255);
                data[3] = (byte) (i11 & 255);
                data[4] = (byte) ((i10 >> 24) & 255);
                data[5] = (byte) ((i10 >> 16) & 255);
                data[6] = (byte) ((i10 >> 8) & 255);
                data[7] = (byte) (i10 & 255);
                this.f64807a.sampleData(this.f64809c, 8, 1);
                return length + 9;
            }
            io.odeeo.internal.q0.x xVar3 = this.f64808b.f64892o;
            int unsignedShort = xVar3.readUnsignedShort();
            xVar3.skipBytes(-2);
            int i12 = (unsignedShort * 6) + 2;
            if (i11 != 0) {
                this.f64809c.reset(i12);
                byte[] data2 = this.f64809c.getData();
                xVar3.readBytes(data2, 0, i12);
                int i13 = (((data2[2] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 8) | (data2[3] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED)) + i11;
                data2[2] = (byte) ((i13 >> 8) & 255);
                data2[3] = (byte) (i13 & 255);
                xVar3 = this.f64809c;
            }
            this.f64807a.sampleData(xVar3, i12, 1);
            return length + 1 + i12;
        }

        public void reset(n nVar, c cVar) {
            this.f64810d = nVar;
            this.f64811e = cVar;
            this.f64807a.format(nVar.f64896a.f64867f);
            resetFragmentInfo();
        }

        public void resetFragmentInfo() {
            this.f64808b.reset();
            this.f64812f = 0;
            this.f64814h = 0;
            this.f64813g = 0;
            this.f64815i = 0;
            this.f64818l = false;
        }

        public void seek(long j10) {
            int i10 = this.f64812f;
            while (true) {
                m mVar = this.f64808b;
                if (i10 >= mVar.f64883f || mVar.getSamplePresentationTimeUs(i10) >= j10) {
                    return;
                }
                if (this.f64808b.f64888k[i10]) {
                    this.f64815i = i10;
                }
                i10++;
            }
        }

        public void skipSampleEncryptionData() {
            l encryptionBoxIfEncrypted = getEncryptionBoxIfEncrypted();
            if (encryptionBoxIfEncrypted == null) {
                return;
            }
            io.odeeo.internal.q0.x xVar = this.f64808b.f64892o;
            int i10 = encryptionBoxIfEncrypted.f64876d;
            if (i10 != 0) {
                xVar.skipBytes(i10);
            }
            if (this.f64808b.sampleHasSubsampleEncryptionTable(this.f64812f)) {
                xVar.skipBytes(xVar.readUnsignedShort() * 6);
            }
        }

        public void updateDrmInitData(io.odeeo.internal.f.e eVar) {
            l sampleDescriptionEncryptionBox = this.f64810d.f64896a.getSampleDescriptionEncryptionBox(((c) g0.castNonNull(this.f64808b.f64878a)).f64769a);
            this.f64807a.format(this.f64810d.f64896a.f64867f.buildUpon().setDrmInitData(eVar.copyWithSchemeType(sampleDescriptionEncryptionBox != null ? sampleDescriptionEncryptionBox.f64874b : null)).build());
        }
    }

    public e() {
        this(0);
    }

    public static boolean b(int i10) {
        return i10 == 1836019574 || i10 == 1953653099 || i10 == 1835297121 || i10 == 1835626086 || i10 == 1937007212 || i10 == 1836019558 || i10 == 1953653094 || i10 == 1836475768 || i10 == 1701082227;
    }

    public static boolean c(int i10) {
        return i10 == 1751411826 || i10 == 1835296868 || i10 == 1836476516 || i10 == 1936286840 || i10 == 1937011556 || i10 == 1937011827 || i10 == 1668576371 || i10 == 1937011555 || i10 == 1937011578 || i10 == 1937013298 || i10 == 1937007471 || i10 == 1668232756 || i10 == 1937011571 || i10 == 1952867444 || i10 == 1952868452 || i10 == 1953196132 || i10 == 1953654136 || i10 == 1953658222 || i10 == 1886614376 || i10 == 1935763834 || i10 == 1935763823 || i10 == 1936027235 || i10 == 1970628964 || i10 == 1935828848 || i10 == 1936158820 || i10 == 1701606260 || i10 == 1835362404 || i10 == 1701671783;
    }

    public static Pair<Integer, c> d(io.odeeo.internal.q0.x xVar) {
        xVar.setPosition(12);
        return Pair.create(Integer.valueOf(xVar.readInt()), new c(xVar.readInt() - 1, xVar.readInt(), xVar.readInt(), xVar.readInt()));
    }

    public k a(k kVar) {
        return kVar;
    }

    @Override // io.odeeo.internal.g.h
    public void init(io.odeeo.internal.g.j jVar) {
        this.E = jVar;
        a();
        b();
        k kVar = this.f64780b;
        if (kVar != null) {
            this.f64782d.put(0, new b(jVar.track(0, kVar.f64863b), new n(this.f64780b, new long[0], new int[0], 0, new long[0], new int[0], 0L), new c(0, 0, 0, 0)));
            this.E.endTracks();
        }
    }

    @Override // io.odeeo.internal.g.h
    public int read(io.odeeo.internal.g.i iVar, u uVar) throws IOException {
        while (true) {
            int i10 = this.f64794p;
            if (i10 != 0) {
                if (i10 == 1) {
                    b(iVar);
                } else if (i10 == 2) {
                    c(iVar);
                } else if (d(iVar)) {
                    return 0;
                }
            } else if (!a(iVar)) {
                return -1;
            }
        }
    }

    @Override // io.odeeo.internal.g.h
    public void release() {
    }

    @Override // io.odeeo.internal.g.h
    public void seek(long j10, long j11) {
        int size = this.f64782d.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.f64782d.valueAt(i10).resetFragmentInfo();
        }
        this.f64792n.clear();
        this.f64800v = 0;
        this.f64801w = j11;
        this.f64791m.clear();
        a();
    }

    @Override // io.odeeo.internal.g.h
    public boolean sniff(io.odeeo.internal.g.i iVar) throws IOException {
        return j.sniffFragmented(iVar);
    }

    public e(int i10) {
        this(i10, null);
    }

    public static /* synthetic */ io.odeeo.internal.g.h[] c() {
        return new io.odeeo.internal.g.h[]{new e()};
    }

    public final void a() {
        this.f64794p = 0;
        this.f64797s = 0;
    }

    public final void b(io.odeeo.internal.g.i iVar) throws IOException {
        int i10 = ((int) this.f64796r) - this.f64797s;
        io.odeeo.internal.q0.x xVar = this.f64798t;
        if (xVar != null) {
            iVar.readFully(xVar.getData(), 8, i10);
            a(new a.b(this.f64795q, xVar), iVar.getPosition());
        } else {
            iVar.skipFully(i10);
        }
        b(iVar.getPosition());
    }

    public e(int i10, e0 e0Var) {
        this(i10, e0Var, null, Collections.EMPTY_LIST);
    }

    public final void c(a.C0622a c0622a) throws io.odeeo.internal.b.g0 {
        int i10 = 0;
        io.odeeo.internal.q0.a.checkState(this.f64780b == null, "Unexpected moov box.");
        io.odeeo.internal.f.e eVarA = a(c0622a.f64741c);
        a.C0622a c0622a2 = (a.C0622a) io.odeeo.internal.q0.a.checkNotNull(c0622a.getContainerAtomOfType(1836475768));
        SparseArray<c> sparseArray = new SparseArray<>();
        int size = c0622a2.f64741c.size();
        long jB = -9223372036854775807L;
        for (int i11 = 0; i11 < size; i11++) {
            a.b bVar = c0622a2.f64741c.get(i11);
            int i12 = bVar.f64739a;
            if (i12 == 1953654136) {
                Pair<Integer, c> pairD = d(bVar.f64743b);
                sparseArray.put(((Integer) pairD.first).intValue(), (c) pairD.second);
            } else if (i12 == 1835362404) {
                jB = b(bVar.f64743b);
            }
        }
        List<n> traks = io.odeeo.internal.n.b.parseTraks(c0622a, new r(), jB, eVarA, (this.f64779a & 16) != 0, false, new io.odeeo.internal.t0.k() { // from class: ws.a
            @Override // io.odeeo.internal.t0.k
            public final Object apply(Object obj) {
                return this.f91238b.a((k) obj);
            }
        });
        int size2 = traks.size();
        if (this.f64782d.size() == 0) {
            while (i10 < size2) {
                n nVar = traks.get(i10);
                k kVar = nVar.f64896a;
                this.f64782d.put(kVar.f64862a, new b(this.E.track(i10, kVar.f64863b), nVar, a(sparseArray, kVar.f64862a)));
                this.f64802x = Math.max(this.f64802x, kVar.f64866e);
                i10++;
            }
            this.E.endTracks();
            return;
        }
        io.odeeo.internal.q0.a.checkState(this.f64782d.size() == size2);
        while (i10 < size2) {
            n nVar2 = traks.get(i10);
            k kVar2 = nVar2.f64896a;
            this.f64782d.get(kVar2.f64862a).reset(nVar2, a(sparseArray, kVar2.f64862a));
            i10++;
        }
    }

    public e(int i10, e0 e0Var, k kVar) {
        this(i10, e0Var, kVar, Collections.EMPTY_LIST);
    }

    public final boolean a(io.odeeo.internal.g.i iVar) throws IOException {
        if (this.f64797s == 0) {
            if (!iVar.readFully(this.f64790l.getData(), 0, 8, true)) {
                return false;
            }
            this.f64797s = 8;
            this.f64790l.setPosition(0);
            this.f64796r = this.f64790l.readUnsignedInt();
            this.f64795q = this.f64790l.readInt();
        }
        long j10 = this.f64796r;
        if (j10 == 1) {
            iVar.readFully(this.f64790l.getData(), 8, 8);
            this.f64797s += 8;
            this.f64796r = this.f64790l.readUnsignedLongToLong();
        } else if (j10 == 0) {
            long length = iVar.getLength();
            if (length == -1 && !this.f64791m.isEmpty()) {
                length = this.f64791m.peek().f64740b;
            }
            if (length != -1) {
                this.f64796r = (length - iVar.getPosition()) + this.f64797s;
            }
        }
        if (this.f64796r >= this.f64797s) {
            long position = iVar.getPosition() - this.f64797s;
            int i10 = this.f64795q;
            if ((i10 == 1836019558 || i10 == 1835295092) && !this.H) {
                this.E.seekMap(new v.b(this.f64802x, position));
                this.H = true;
            }
            if (this.f64795q == 1836019558) {
                int size = this.f64782d.size();
                for (int i11 = 0; i11 < size; i11++) {
                    m mVar = this.f64782d.valueAt(i11).f64808b;
                    mVar.f64879b = position;
                    mVar.f64881d = position;
                    mVar.f64880c = position;
                }
            }
            int i12 = this.f64795q;
            if (i12 == 1835295092) {
                this.f64804z = null;
                this.f64799u = position + this.f64796r;
                this.f64794p = 2;
                return true;
            }
            if (b(i12)) {
                long position2 = (iVar.getPosition() + this.f64796r) - 8;
                this.f64791m.push(new a.C0622a(this.f64795q, position2));
                if (this.f64796r == this.f64797s) {
                    b(position2);
                } else {
                    a();
                }
            } else if (c(this.f64795q)) {
                if (this.f64797s == 8) {
                    long j11 = this.f64796r;
                    if (j11 <= 2147483647L) {
                        io.odeeo.internal.q0.x xVar = new io.odeeo.internal.q0.x((int) j11);
                        System.arraycopy(this.f64790l.getData(), 0, xVar.getData(), 0, 8);
                        this.f64798t = xVar;
                        this.f64794p = 1;
                    } else {
                        throw io.odeeo.internal.b.g0.createForUnsupportedContainerFeature("Leaf atom with length > 2147483647 (unsupported).");
                    }
                } else {
                    throw io.odeeo.internal.b.g0.createForUnsupportedContainerFeature("Leaf atom defines extended atom size (unsupported).");
                }
            } else if (this.f64796r <= 2147483647L) {
                this.f64798t = null;
                this.f64794p = 1;
            } else {
                throw io.odeeo.internal.b.g0.createForUnsupportedContainerFeature("Skipping atom with length > 2147483647 (unsupported).");
            }
            return true;
        }
        throw io.odeeo.internal.b.g0.createForUnsupportedContainerFeature("Atom size less than header length (unsupported).");
    }

    public e(int i10, e0 e0Var, k kVar, List<t> list) {
        this(i10, e0Var, kVar, list, null);
    }

    public e(int i10, e0 e0Var, k kVar, List<t> list, x xVar) {
        this.f64779a = i10;
        this.f64788j = e0Var;
        this.f64780b = kVar;
        this.f64781c = Collections.unmodifiableList(list);
        this.f64793o = xVar;
        this.f64789k = new io.odeeo.internal.u.c();
        this.f64790l = new io.odeeo.internal.q0.x(16);
        this.f64783e = new io.odeeo.internal.q0.x(io.odeeo.internal.q0.u.f65926a);
        this.f64784f = new io.odeeo.internal.q0.x(5);
        this.f64785g = new io.odeeo.internal.q0.x();
        byte[] bArr = new byte[16];
        this.f64786h = bArr;
        this.f64787i = new io.odeeo.internal.q0.x(bArr);
        this.f64791m = new ArrayDeque<>();
        this.f64792n = new ArrayDeque<>();
        this.f64782d = new SparseArray<>();
        this.f64802x = C.TIME_UNSET;
        this.f64801w = C.TIME_UNSET;
        this.f64803y = C.TIME_UNSET;
        this.E = io.odeeo.internal.g.j.f64142d;
        this.F = new x[0];
        this.G = new x[0];
    }

    public final void b(long j10) throws io.odeeo.internal.b.g0 {
        while (!this.f64791m.isEmpty() && this.f64791m.peek().f64740b == j10) {
            a(this.f64791m.pop());
        }
        a();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean d(io.odeeo.internal.g.i iVar) throws IOException {
        boolean z10;
        int i10;
        int iSampleData;
        b bVarA = this.f64804z;
        Throwable th2 = null;
        if (bVarA == null) {
            bVarA = a(this.f64782d);
            if (bVarA == null) {
                int position = (int) (this.f64799u - iVar.getPosition());
                if (position >= 0) {
                    iVar.skipFully(position);
                    a();
                    return false;
                }
                throw io.odeeo.internal.b.g0.createForMalformedContainer("Offset to end of mdat was negative.", null);
            }
            int currentSampleOffset = (int) (bVarA.getCurrentSampleOffset() - iVar.getPosition());
            if (currentSampleOffset < 0) {
                p.w("FragmentedMp4Extractor", "Ignoring negative offset to sample data.");
                currentSampleOffset = 0;
            }
            iVar.skipFully(currentSampleOffset);
            this.f64804z = bVarA;
        }
        int i11 = 4;
        int i12 = 1;
        if (this.f64794p == 3) {
            int currentSampleSize = bVarA.getCurrentSampleSize();
            this.A = currentSampleSize;
            if (bVarA.f64812f < bVarA.f64815i) {
                iVar.skipFully(currentSampleSize);
                bVarA.skipSampleEncryptionData();
                if (!bVarA.next()) {
                    this.f64804z = null;
                }
                this.f64794p = 3;
                return true;
            }
            if (bVarA.f64810d.f64896a.f64868g == 1) {
                this.A = currentSampleSize - 8;
                iVar.skipFully(8);
            }
            if ("audio/ac4".equals(bVarA.f64810d.f64896a.f64867f.f62971l)) {
                this.B = bVarA.outputSampleEncryptionData(this.A, 7);
                io.odeeo.internal.d.c.getAc4SampleHeader(this.A, this.f64787i);
                bVarA.f64807a.sampleData(this.f64787i, 7);
                this.B += 7;
            } else {
                this.B = bVarA.outputSampleEncryptionData(this.A, 0);
            }
            this.A += this.B;
            this.f64794p = 4;
            this.C = 0;
        }
        k kVar = bVarA.f64810d.f64896a;
        x xVar = bVarA.f64807a;
        long currentSamplePresentationTimeUs = bVarA.getCurrentSamplePresentationTimeUs();
        e0 e0Var = this.f64788j;
        if (e0Var != null) {
            currentSamplePresentationTimeUs = e0Var.adjustSampleTimestamp(currentSamplePresentationTimeUs);
        }
        if (kVar.f64871j == 0) {
            z10 = 1;
            while (true) {
                int i13 = this.B;
                int i14 = this.A;
                if (i13 >= i14) {
                    break;
                }
                this.B += xVar.sampleData((io.odeeo.internal.p0.g) iVar, i14 - i13, false);
            }
        } else {
            byte[] data = this.f64784f.getData();
            data[0] = 0;
            data[1] = 0;
            data[2] = 0;
            int i15 = kVar.f64871j;
            int i16 = i15 + 1;
            int i17 = 4 - i15;
            while (this.B < this.A) {
                int i18 = this.C;
                if (i18 == 0) {
                    iVar.readFully(data, i17, i16);
                    this.f64784f.setPosition(0);
                    int i19 = this.f64784f.readInt();
                    if (i19 >= i12) {
                        this.C = i19 - 1;
                        this.f64783e.setPosition(0);
                        xVar.sampleData(this.f64783e, i11);
                        xVar.sampleData(this.f64784f, i12);
                        this.D = (this.G.length <= 0 || !io.odeeo.internal.q0.u.isNalUnitSei(kVar.f64867f.f62971l, data[i11])) ? 0 : i12;
                        this.B += 5;
                        this.A += i17;
                    } else {
                        throw io.odeeo.internal.b.g0.createForMalformedContainer("Invalid NAL length", th2);
                    }
                } else {
                    if (this.D) {
                        this.f64785g.reset(i18);
                        iVar.readFully(this.f64785g.getData(), 0, this.C);
                        xVar.sampleData(this.f64785g, this.C);
                        iSampleData = this.C;
                        int iUnescapeStream = io.odeeo.internal.q0.u.unescapeStream(this.f64785g.getData(), this.f64785g.limit());
                        i10 = i12;
                        this.f64785g.setPosition("video/hevc".equals(kVar.f64867f.f62971l) ? 1 : 0);
                        this.f64785g.setLimit(iUnescapeStream);
                        io.odeeo.internal.g.b.consume(currentSamplePresentationTimeUs, this.f64785g, this.G);
                    } else {
                        i10 = i12;
                        iSampleData = xVar.sampleData((io.odeeo.internal.p0.g) iVar, i18, false);
                    }
                    this.B += iSampleData;
                    this.C -= iSampleData;
                    i12 = i10;
                    th2 = null;
                    i11 = 4;
                }
            }
            z10 = i12;
        }
        int currentSampleFlags = bVarA.getCurrentSampleFlags();
        l encryptionBoxIfEncrypted = bVarA.getEncryptionBoxIfEncrypted();
        xVar.sampleMetadata(currentSamplePresentationTimeUs, currentSampleFlags, this.A, 0, encryptionBoxIfEncrypted != null ? encryptionBoxIfEncrypted.f64875c : null);
        a(currentSamplePresentationTimeUs);
        if (!bVarA.next()) {
            this.f64804z = null;
        }
        this.f64794p = 3;
        return z10;
    }

    public final void b(a.C0622a c0622a) throws io.odeeo.internal.b.g0 {
        a(c0622a, this.f64782d, this.f64780b != null, this.f64779a, this.f64786h);
        io.odeeo.internal.f.e eVarA = a(c0622a.f64741c);
        if (eVarA != null) {
            int size = this.f64782d.size();
            for (int i10 = 0; i10 < size; i10++) {
                this.f64782d.valueAt(i10).updateDrmInitData(eVarA);
            }
        }
        if (this.f64801w != C.TIME_UNSET) {
            int size2 = this.f64782d.size();
            for (int i11 = 0; i11 < size2; i11++) {
                this.f64782d.valueAt(i11).seek(this.f64801w);
            }
            this.f64801w = C.TIME_UNSET;
        }
    }

    public final void b() {
        int i10;
        x[] xVarArr = new x[2];
        this.F = xVarArr;
        x xVar = this.f64793o;
        int i11 = 0;
        if (xVar != null) {
            xVarArr[0] = xVar;
            i10 = 1;
        } else {
            i10 = 0;
        }
        int i12 = 100;
        if ((this.f64779a & 4) != 0) {
            xVarArr[i10] = this.E.track(100, 5);
            i12 = 101;
            i10++;
        }
        x[] xVarArr2 = (x[]) g0.nullSafeArrayCopy(this.F, i10);
        this.F = xVarArr2;
        for (x xVar2 : xVarArr2) {
            xVar2.format(K);
        }
        this.G = new x[this.f64781c.size()];
        while (i11 < this.G.length) {
            x xVarTrack = this.E.track(i12, 3);
            xVarTrack.format(this.f64781c.get(i11));
            this.G[i11] = xVarTrack;
            i11++;
            i12++;
        }
    }

    public static long c(io.odeeo.internal.q0.x xVar) {
        xVar.setPosition(8);
        return io.odeeo.internal.n.a.parseFullAtomVersion(xVar.readInt()) == 1 ? xVar.readUnsignedLongToLong() : xVar.readUnsignedInt();
    }

    public static long b(io.odeeo.internal.q0.x xVar) {
        xVar.setPosition(8);
        return io.odeeo.internal.n.a.parseFullAtomVersion(xVar.readInt()) == 0 ? xVar.readUnsignedInt() : xVar.readUnsignedLongToLong();
    }

    public final void c(io.odeeo.internal.g.i iVar) throws IOException {
        int size = this.f64782d.size();
        long j10 = Long.MAX_VALUE;
        b bVarValueAt = null;
        for (int i10 = 0; i10 < size; i10++) {
            m mVar = this.f64782d.valueAt(i10).f64808b;
            if (mVar.f64893p) {
                long j11 = mVar.f64881d;
                if (j11 < j10) {
                    bVarValueAt = this.f64782d.valueAt(i10);
                    j10 = j11;
                }
            }
        }
        if (bVarValueAt == null) {
            this.f64794p = 3;
            return;
        }
        int position = (int) (j10 - iVar.getPosition());
        if (position >= 0) {
            iVar.skipFully(position);
            bVarValueAt.f64808b.fillEncryptionData(iVar);
            return;
        }
        throw io.odeeo.internal.b.g0.createForMalformedContainer("Offset to encryption data was negative.", null);
    }

    public static void b(a.C0622a c0622a, SparseArray<b> sparseArray, boolean z10, int i10, byte[] bArr) throws io.odeeo.internal.b.g0 {
        b bVarA = a(((a.b) io.odeeo.internal.q0.a.checkNotNull(c0622a.getLeafAtomOfType(1952868452))).f64743b, sparseArray, z10);
        if (bVarA == null) {
            return;
        }
        m mVar = bVarA.f64808b;
        long j10 = mVar.f64894q;
        boolean z11 = mVar.f64895r;
        bVarA.resetFragmentInfo();
        bVarA.f64818l = true;
        a.b leafAtomOfType = c0622a.getLeafAtomOfType(1952867444);
        if (leafAtomOfType != null && (i10 & 2) == 0) {
            mVar.f64894q = c(leafAtomOfType.f64743b);
            mVar.f64895r = true;
        } else {
            mVar.f64894q = j10;
            mVar.f64895r = z11;
        }
        a(c0622a, bVarA, i10);
        l sampleDescriptionEncryptionBox = bVarA.f64810d.f64896a.getSampleDescriptionEncryptionBox(((c) io.odeeo.internal.q0.a.checkNotNull(mVar.f64878a)).f64769a);
        a.b leafAtomOfType2 = c0622a.getLeafAtomOfType(1935763834);
        if (leafAtomOfType2 != null) {
            a((l) io.odeeo.internal.q0.a.checkNotNull(sampleDescriptionEncryptionBox), leafAtomOfType2.f64743b, mVar);
        }
        a.b leafAtomOfType3 = c0622a.getLeafAtomOfType(1935763823);
        if (leafAtomOfType3 != null) {
            a(leafAtomOfType3.f64743b, mVar);
        }
        a.b leafAtomOfType4 = c0622a.getLeafAtomOfType(1936027235);
        if (leafAtomOfType4 != null) {
            b(leafAtomOfType4.f64743b, mVar);
        }
        a(c0622a, sampleDescriptionEncryptionBox != null ? sampleDescriptionEncryptionBox.f64874b : null, mVar);
        int size = c0622a.f64741c.size();
        for (int i11 = 0; i11 < size; i11++) {
            a.b bVar = c0622a.f64741c.get(i11);
            if (bVar.f64739a == 1970628964) {
                a(bVar.f64743b, mVar, bArr);
            }
        }
    }

    public final void a(a.b bVar, long j10) throws io.odeeo.internal.b.g0 {
        if (!this.f64791m.isEmpty()) {
            this.f64791m.peek().add(bVar);
            return;
        }
        int i10 = bVar.f64739a;
        if (i10 != 1936286840) {
            if (i10 == 1701671783) {
                a(bVar.f64743b);
            }
        } else {
            Pair<Long, io.odeeo.internal.g.c> pairA = a(bVar.f64743b, j10);
            this.f64803y = ((Long) pairA.first).longValue();
            this.E.seekMap((v) pairA.second);
            this.H = true;
        }
    }

    public final void a(a.C0622a c0622a) throws io.odeeo.internal.b.g0 {
        int i10 = c0622a.f64739a;
        if (i10 == 1836019574) {
            c(c0622a);
        } else if (i10 == 1836019558) {
            b(c0622a);
        } else {
            if (this.f64791m.isEmpty()) {
                return;
            }
            this.f64791m.peek().add(c0622a);
        }
    }

    public static void b(io.odeeo.internal.q0.x xVar, m mVar) throws io.odeeo.internal.b.g0 {
        a(xVar, 0, mVar);
    }

    public final c a(SparseArray<c> sparseArray, int i10) {
        if (sparseArray.size() == 1) {
            return sparseArray.valueAt(0);
        }
        return (c) io.odeeo.internal.q0.a.checkNotNull(sparseArray.get(i10));
    }

    public final void a(io.odeeo.internal.q0.x xVar) {
        String str;
        String str2;
        long jScaleLargeTimestamp;
        long jScaleLargeTimestamp2;
        long unsignedInt;
        long jAdjustSampleTimestamp;
        if (this.F.length == 0) {
            return;
        }
        xVar.setPosition(8);
        int fullAtomVersion = io.odeeo.internal.n.a.parseFullAtomVersion(xVar.readInt());
        if (fullAtomVersion != 0) {
            if (fullAtomVersion != 1) {
                e3.g.z(fullAtomVersion, "Skipping unsupported emsg version: ", "FragmentedMp4Extractor");
                return;
            }
            long unsignedInt2 = xVar.readUnsignedInt();
            jAdjustSampleTimestamp = g0.scaleLargeTimestamp(xVar.readUnsignedLongToLong(), 1000000L, unsignedInt2);
            long jScaleLargeTimestamp3 = g0.scaleLargeTimestamp(xVar.readUnsignedInt(), 1000L, unsignedInt2);
            long unsignedInt3 = xVar.readUnsignedInt();
            str = (String) io.odeeo.internal.q0.a.checkNotNull(xVar.readNullTerminatedString());
            str2 = (String) io.odeeo.internal.q0.a.checkNotNull(xVar.readNullTerminatedString());
            jScaleLargeTimestamp2 = jScaleLargeTimestamp3;
            unsignedInt = unsignedInt3;
            jScaleLargeTimestamp = -9223372036854775807L;
        } else {
            str = (String) io.odeeo.internal.q0.a.checkNotNull(xVar.readNullTerminatedString());
            str2 = (String) io.odeeo.internal.q0.a.checkNotNull(xVar.readNullTerminatedString());
            long unsignedInt4 = xVar.readUnsignedInt();
            jScaleLargeTimestamp = g0.scaleLargeTimestamp(xVar.readUnsignedInt(), 1000000L, unsignedInt4);
            long j10 = this.f64803y;
            long j11 = j10 != C.TIME_UNSET ? j10 + jScaleLargeTimestamp : -9223372036854775807L;
            jScaleLargeTimestamp2 = g0.scaleLargeTimestamp(xVar.readUnsignedInt(), 1000L, unsignedInt4);
            unsignedInt = xVar.readUnsignedInt();
            jAdjustSampleTimestamp = j11;
        }
        String str3 = str;
        String str4 = str2;
        byte[] bArr = new byte[xVar.bytesLeft()];
        xVar.readBytes(bArr, 0, xVar.bytesLeft());
        io.odeeo.internal.q0.x xVar2 = new io.odeeo.internal.q0.x(this.f64789k.encode(new io.odeeo.internal.u.a(str3, str4, jScaleLargeTimestamp2, unsignedInt, bArr)));
        int iBytesLeft = xVar2.bytesLeft();
        for (x xVar3 : this.F) {
            xVar2.setPosition(0);
            xVar3.sampleData(xVar2, iBytesLeft);
        }
        if (jAdjustSampleTimestamp == C.TIME_UNSET) {
            this.f64792n.addLast(new a(jScaleLargeTimestamp, iBytesLeft));
            this.f64800v += iBytesLeft;
            return;
        }
        e0 e0Var = this.f64788j;
        if (e0Var != null) {
            jAdjustSampleTimestamp = e0Var.adjustSampleTimestamp(jAdjustSampleTimestamp);
        }
        long j12 = jAdjustSampleTimestamp;
        for (x xVar4 : this.F) {
            xVar4.sampleMetadata(j12, 1, iBytesLeft, 0, null);
        }
    }

    public static void a(a.C0622a c0622a, SparseArray<b> sparseArray, boolean z10, int i10, byte[] bArr) throws io.odeeo.internal.b.g0 {
        int size = c0622a.f64742d.size();
        for (int i11 = 0; i11 < size; i11++) {
            a.C0622a c0622a2 = c0622a.f64742d.get(i11);
            if (c0622a2.f64739a == 1953653094) {
                b(c0622a2, sparseArray, z10, i10, bArr);
            }
        }
    }

    public static void a(a.C0622a c0622a, b bVar, int i10) throws io.odeeo.internal.b.g0 {
        List<a.b> list = c0622a.f64741c;
        int size = list.size();
        int i11 = 0;
        int i12 = 0;
        for (int i13 = 0; i13 < size; i13++) {
            a.b bVar2 = list.get(i13);
            if (bVar2.f64739a == 1953658222) {
                io.odeeo.internal.q0.x xVar = bVar2.f64743b;
                xVar.setPosition(12);
                int unsignedIntToInt = xVar.readUnsignedIntToInt();
                if (unsignedIntToInt > 0) {
                    i12 += unsignedIntToInt;
                    i11++;
                }
            }
        }
        bVar.f64814h = 0;
        bVar.f64813g = 0;
        bVar.f64812f = 0;
        bVar.f64808b.initTables(i11, i12);
        int i14 = 0;
        int iA = 0;
        for (int i15 = 0; i15 < size; i15++) {
            a.b bVar3 = list.get(i15);
            if (bVar3.f64739a == 1953658222) {
                iA = a(bVar, i14, i10, bVar3.f64743b, iA);
                i14++;
            }
        }
    }

    public static void a(l lVar, io.odeeo.internal.q0.x xVar, m mVar) throws io.odeeo.internal.b.g0 {
        int i10;
        int i11 = lVar.f64876d;
        xVar.setPosition(8);
        if ((io.odeeo.internal.n.a.parseFullAtomFlags(xVar.readInt()) & 1) == 1) {
            xVar.skipBytes(8);
        }
        int unsignedByte = xVar.readUnsignedByte();
        int unsignedIntToInt = xVar.readUnsignedIntToInt();
        if (unsignedIntToInt <= mVar.f64883f) {
            if (unsignedByte == 0) {
                boolean[] zArr = mVar.f64890m;
                i10 = 0;
                for (int i12 = 0; i12 < unsignedIntToInt; i12++) {
                    int unsignedByte2 = xVar.readUnsignedByte();
                    i10 += unsignedByte2;
                    zArr[i12] = unsignedByte2 > i11;
                }
            } else {
                i10 = unsignedByte * unsignedIntToInt;
                Arrays.fill(mVar.f64890m, 0, unsignedIntToInt, unsignedByte > i11);
            }
            Arrays.fill(mVar.f64890m, unsignedIntToInt, mVar.f64883f, false);
            if (i10 > 0) {
                mVar.initEncryptionData(i10);
                return;
            }
            return;
        }
        StringBuilder sbT = o2.t(unsignedIntToInt, "Saiz sample count ", KerkSviMAy.UCutvVpDB);
        sbT.append(mVar.f64883f);
        throw io.odeeo.internal.b.g0.createForMalformedContainer(sbT.toString(), null);
    }

    public static void a(io.odeeo.internal.q0.x xVar, m mVar) throws io.odeeo.internal.b.g0 {
        xVar.setPosition(8);
        int i10 = xVar.readInt();
        if ((io.odeeo.internal.n.a.parseFullAtomFlags(i10) & 1) == 1) {
            xVar.skipBytes(8);
        }
        int unsignedIntToInt = xVar.readUnsignedIntToInt();
        if (unsignedIntToInt == 1) {
            mVar.f64881d += io.odeeo.internal.n.a.parseFullAtomVersion(i10) == 0 ? xVar.readUnsignedInt() : xVar.readUnsignedLongToLong();
        } else {
            throw io.odeeo.internal.b.g0.createForMalformedContainer("Unexpected saio entry count: " + unsignedIntToInt, null);
        }
    }

    public static b a(io.odeeo.internal.q0.x xVar, SparseArray<b> sparseArray, boolean z10) {
        int i10;
        int i11;
        int i12;
        int i13;
        xVar.setPosition(8);
        int fullAtomFlags = io.odeeo.internal.n.a.parseFullAtomFlags(xVar.readInt());
        b bVarValueAt = z10 ? sparseArray.valueAt(0) : sparseArray.get(xVar.readInt());
        if (bVarValueAt == null) {
            return null;
        }
        if ((fullAtomFlags & 1) != 0) {
            long unsignedLongToLong = xVar.readUnsignedLongToLong();
            m mVar = bVarValueAt.f64808b;
            mVar.f64880c = unsignedLongToLong;
            mVar.f64881d = unsignedLongToLong;
        }
        c cVar = bVarValueAt.f64811e;
        if ((fullAtomFlags & 2) != 0) {
            i10 = xVar.readInt() - 1;
        } else {
            i10 = cVar.f64769a;
        }
        if ((fullAtomFlags & 8) != 0) {
            i11 = xVar.readInt();
        } else {
            i11 = cVar.f64770b;
        }
        if ((fullAtomFlags & 16) != 0) {
            i12 = xVar.readInt();
        } else {
            i12 = cVar.f64771c;
        }
        if ((fullAtomFlags & 32) != 0) {
            i13 = xVar.readInt();
        } else {
            i13 = cVar.f64772d;
        }
        bVarValueAt.f64808b.f64878a = new c(i10, i11, i12, i13);
        return bVarValueAt;
    }

    public static int a(b bVar, int i10, int i11, io.odeeo.internal.q0.x xVar, int i12) throws io.odeeo.internal.b.g0 {
        boolean z10;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        xVar.setPosition(8);
        int fullAtomFlags = io.odeeo.internal.n.a.parseFullAtomFlags(xVar.readInt());
        k kVar = bVar.f64810d.f64896a;
        m mVar = bVar.f64808b;
        c cVar = (c) g0.castNonNull(mVar.f64878a);
        mVar.f64885h[i10] = xVar.readUnsignedIntToInt();
        long[] jArr = mVar.f64884g;
        long j10 = mVar.f64880c;
        jArr[i10] = j10;
        if ((fullAtomFlags & 1) != 0) {
            jArr[i10] = j10 + xVar.readInt();
        }
        boolean z11 = (fullAtomFlags & 4) != 0;
        int i20 = cVar.f64772d;
        if (z11) {
            i20 = xVar.readInt();
        }
        boolean z12 = (fullAtomFlags & NotificationCompat.FLAG_LOCAL_ONLY) != 0;
        boolean z13 = (fullAtomFlags & 512) != 0;
        boolean z14 = (fullAtomFlags & 1024) != 0;
        boolean z15 = (fullAtomFlags & 2048) != 0;
        long[] jArr2 = kVar.f64869h;
        long j11 = 0;
        if (jArr2 != null && jArr2.length == 1 && jArr2[0] == 0) {
            j11 = ((long[]) g0.castNonNull(kVar.f64870i))[0];
        }
        int[] iArr = mVar.f64886i;
        long[] jArr3 = mVar.f64887j;
        boolean[] zArr = mVar.f64888k;
        boolean z16 = z15;
        boolean z17 = kVar.f64863b == 2 && (i11 & 1) != 0;
        int i21 = i12 + mVar.f64885h[i10];
        boolean z18 = z11;
        long j12 = kVar.f64864c;
        long j13 = mVar.f64894q;
        int i22 = i12;
        while (i22 < i21) {
            if (z12) {
                i13 = xVar.readInt();
                z10 = z17;
            } else {
                z10 = z17;
                i13 = cVar.f64770b;
            }
            int iA = a(i13);
            if (z13) {
                i15 = xVar.readInt();
                i14 = i21;
            } else {
                i14 = i21;
                i15 = cVar.f64771c;
            }
            int iA2 = a(i15);
            if (z14) {
                i16 = iA2;
                i17 = xVar.readInt();
            } else if (i22 == 0 && z18) {
                i16 = iA2;
                i17 = i20;
            } else {
                i16 = iA2;
                i17 = cVar.f64772d;
            }
            if (z16) {
                i18 = i17;
                i19 = xVar.readInt();
            } else {
                i18 = i17;
                i19 = 0;
            }
            int i23 = i22;
            long jScaleLargeTimestamp = g0.scaleLargeTimestamp((i19 + j13) - j11, 1000000L, j12);
            jArr3[i23] = jScaleLargeTimestamp;
            if (!mVar.f64895r) {
                jArr3[i23] = jScaleLargeTimestamp + bVar.f64810d.f64903h;
            }
            iArr[i23] = i16;
            zArr[i23] = ((i18 >> 16) & 1) == 0 && (!z10 || i23 == 0);
            j13 += iA;
            i22 = i23 + 1;
            i21 = i14;
            z17 = z10;
        }
        int i24 = i21;
        mVar.f64894q = j13;
        return i24;
    }

    public static int a(int i10) throws io.odeeo.internal.b.g0 {
        if (i10 >= 0) {
            return i10;
        }
        throw io.odeeo.internal.b.g0.createForMalformedContainer("Unexpected negative value: " + i10, null);
    }

    public static void a(io.odeeo.internal.q0.x xVar, m mVar, byte[] bArr) throws io.odeeo.internal.b.g0 {
        xVar.setPosition(8);
        xVar.readBytes(bArr, 0, 16);
        if (Arrays.equals(bArr, J)) {
            a(xVar, 16, mVar);
        }
    }

    public static void a(io.odeeo.internal.q0.x xVar, int i10, m mVar) throws io.odeeo.internal.b.g0 {
        xVar.setPosition(i10 + 8);
        int fullAtomFlags = io.odeeo.internal.n.a.parseFullAtomFlags(xVar.readInt());
        if ((fullAtomFlags & 1) == 0) {
            boolean z10 = (fullAtomFlags & 2) != 0;
            int unsignedIntToInt = xVar.readUnsignedIntToInt();
            if (unsignedIntToInt == 0) {
                Arrays.fill(mVar.f64890m, 0, mVar.f64883f, false);
                return;
            }
            if (unsignedIntToInt == mVar.f64883f) {
                Arrays.fill(mVar.f64890m, 0, unsignedIntToInt, z10);
                mVar.initEncryptionData(xVar.bytesLeft());
                mVar.fillEncryptionData(xVar);
                return;
            } else {
                StringBuilder sbT = o2.t(unsignedIntToInt, "Senc sample count ", " is different from fragment sample count");
                sbT.append(mVar.f64883f);
                throw io.odeeo.internal.b.g0.createForMalformedContainer(sbT.toString(), null);
            }
        }
        throw io.odeeo.internal.b.g0.createForUnsupportedContainerFeature("Overriding TrackEncryptionBox parameters is unsupported.");
    }

    public static void a(a.C0622a c0622a, String str, m mVar) throws io.odeeo.internal.b.g0 {
        byte[] bArr = null;
        io.odeeo.internal.q0.x xVar = null;
        io.odeeo.internal.q0.x xVar2 = null;
        for (int i10 = 0; i10 < c0622a.f64741c.size(); i10++) {
            a.b bVar = c0622a.f64741c.get(i10);
            io.odeeo.internal.q0.x xVar3 = bVar.f64743b;
            int i11 = bVar.f64739a;
            if (i11 == 1935828848) {
                xVar3.setPosition(12);
                if (xVar3.readInt() == 1936025959) {
                    xVar = xVar3;
                }
            } else if (i11 == 1936158820) {
                xVar3.setPosition(12);
                if (xVar3.readInt() == 1936025959) {
                    xVar2 = xVar3;
                }
            }
        }
        if (xVar == null || xVar2 == null) {
            return;
        }
        xVar.setPosition(8);
        int fullAtomVersion = io.odeeo.internal.n.a.parseFullAtomVersion(xVar.readInt());
        xVar.skipBytes(4);
        if (fullAtomVersion == 1) {
            xVar.skipBytes(4);
        }
        if (xVar.readInt() == 1) {
            xVar2.setPosition(8);
            int fullAtomVersion2 = io.odeeo.internal.n.a.parseFullAtomVersion(xVar2.readInt());
            xVar2.skipBytes(4);
            if (fullAtomVersion2 == 1) {
                if (xVar2.readUnsignedInt() == 0) {
                    throw io.odeeo.internal.b.g0.createForUnsupportedContainerFeature("Variable length description in sgpd found (unsupported)");
                }
            } else if (fullAtomVersion2 >= 2) {
                xVar2.skipBytes(4);
            }
            if (xVar2.readUnsignedInt() == 1) {
                xVar2.skipBytes(1);
                int unsignedByte = xVar2.readUnsignedByte();
                int i12 = (unsignedByte & PsExtractor.VIDEO_STREAM_MASK) >> 4;
                int i13 = unsignedByte & 15;
                boolean z10 = xVar2.readUnsignedByte() == 1;
                if (z10) {
                    int unsignedByte2 = xVar2.readUnsignedByte();
                    byte[] bArr2 = new byte[16];
                    xVar2.readBytes(bArr2, 0, 16);
                    if (unsignedByte2 == 0) {
                        int unsignedByte3 = xVar2.readUnsignedByte();
                        bArr = new byte[unsignedByte3];
                        xVar2.readBytes(bArr, 0, unsignedByte3);
                    }
                    mVar.f64889l = true;
                    mVar.f64891n = new l(z10, str, unsignedByte2, bArr2, i12, i13, bArr);
                    return;
                }
                return;
            }
            throw io.odeeo.internal.b.g0.createForUnsupportedContainerFeature("Entry count in sgpd != 1 (unsupported).");
        }
        throw io.odeeo.internal.b.g0.createForUnsupportedContainerFeature("Entry count in sbgp != 1 (unsupported).");
    }

    public static Pair<Long, io.odeeo.internal.g.c> a(io.odeeo.internal.q0.x xVar, long j10) throws io.odeeo.internal.b.g0 {
        long unsignedLongToLong;
        long unsignedLongToLong2;
        xVar.setPosition(8);
        int fullAtomVersion = io.odeeo.internal.n.a.parseFullAtomVersion(xVar.readInt());
        xVar.skipBytes(4);
        long unsignedInt = xVar.readUnsignedInt();
        if (fullAtomVersion == 0) {
            unsignedLongToLong = xVar.readUnsignedInt();
            unsignedLongToLong2 = xVar.readUnsignedInt();
        } else {
            unsignedLongToLong = xVar.readUnsignedLongToLong();
            unsignedLongToLong2 = xVar.readUnsignedLongToLong();
        }
        long j11 = unsignedLongToLong2 + j10;
        long jScaleLargeTimestamp = g0.scaleLargeTimestamp(unsignedLongToLong, 1000000L, unsignedInt);
        xVar.skipBytes(2);
        int unsignedShort = xVar.readUnsignedShort();
        int[] iArr = new int[unsignedShort];
        long[] jArr = new long[unsignedShort];
        long[] jArr2 = new long[unsignedShort];
        long[] jArr3 = new long[unsignedShort];
        long j12 = j11;
        long jScaleLargeTimestamp2 = jScaleLargeTimestamp;
        int i10 = 0;
        while (i10 < unsignedShort) {
            int i11 = xVar.readInt();
            if ((Integer.MIN_VALUE & i11) == 0) {
                long unsignedInt2 = xVar.readUnsignedInt();
                iArr[i10] = i11 & Integer.MAX_VALUE;
                jArr[i10] = j12;
                jArr3[i10] = jScaleLargeTimestamp2;
                unsignedLongToLong += unsignedInt2;
                long[] jArr4 = jArr3;
                jScaleLargeTimestamp2 = g0.scaleLargeTimestamp(unsignedLongToLong, 1000000L, unsignedInt);
                jArr2[i10] = jScaleLargeTimestamp2 - jArr4[i10];
                xVar.skipBytes(4);
                j12 += iArr[i10];
                i10++;
                jArr3 = jArr4;
            } else {
                throw io.odeeo.internal.b.g0.createForMalformedContainer("Unhandled indirect reference", null);
            }
        }
        return Pair.create(Long.valueOf(jScaleLargeTimestamp), new io.odeeo.internal.g.c(iArr, jArr, jArr2, jArr3));
    }

    public final void a(long j10) {
        while (!this.f64792n.isEmpty()) {
            a aVarRemoveFirst = this.f64792n.removeFirst();
            this.f64800v -= aVarRemoveFirst.f64806b;
            long jAdjustSampleTimestamp = aVarRemoveFirst.f64805a + j10;
            e0 e0Var = this.f64788j;
            if (e0Var != null) {
                jAdjustSampleTimestamp = e0Var.adjustSampleTimestamp(jAdjustSampleTimestamp);
            }
            long j11 = jAdjustSampleTimestamp;
            for (x xVar : this.F) {
                xVar.sampleMetadata(j11, 1, aVarRemoveFirst.f64806b, this.f64800v, null);
            }
        }
    }

    public static b a(SparseArray<b> sparseArray) {
        int size = sparseArray.size();
        b bVar = null;
        long j10 = Long.MAX_VALUE;
        for (int i10 = 0; i10 < size; i10++) {
            b bVarValueAt = sparseArray.valueAt(i10);
            if ((bVarValueAt.f64818l || bVarValueAt.f64812f != bVarValueAt.f64810d.f64897b) && (!bVarValueAt.f64818l || bVarValueAt.f64814h != bVarValueAt.f64808b.f64882e)) {
                long currentSampleOffset = bVarValueAt.getCurrentSampleOffset();
                if (currentSampleOffset < j10) {
                    bVar = bVarValueAt;
                    j10 = currentSampleOffset;
                }
            }
        }
        return bVar;
    }

    public static io.odeeo.internal.f.e a(List<a.b> list) {
        int size = list.size();
        ArrayList arrayList = null;
        for (int i10 = 0; i10 < size; i10++) {
            a.b bVar = list.get(i10);
            if (bVar.f64739a == 1886614376) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                byte[] data = bVar.f64743b.getData();
                UUID uuid = h.parseUuid(data);
                if (uuid == null) {
                    p.w("FragmentedMp4Extractor", "Skipped pssh atom (failed to extract uuid)");
                } else {
                    arrayList.add(new e.b(uuid, MimeTypes.VIDEO_MP4, data));
                }
            }
        }
        if (arrayList == null) {
            return null;
        }
        return new io.odeeo.internal.f.e(arrayList);
    }
}
