package io.odeeo.internal.p;

import com.inmobi.commons.core.configs.AdConfig;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import io.odeeo.internal.b.t;
import io.odeeo.internal.d.r;
import io.odeeo.internal.p.d0;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class q implements j {

    /* renamed from: a, reason: collision with root package name */
    public final io.odeeo.internal.q0.x f65511a;

    /* renamed from: b, reason: collision with root package name */
    public final r.a f65512b;

    /* renamed from: c, reason: collision with root package name */
    public final String f65513c;

    /* renamed from: d, reason: collision with root package name */
    public io.odeeo.internal.g.x f65514d;

    /* renamed from: e, reason: collision with root package name */
    public String f65515e;

    /* renamed from: f, reason: collision with root package name */
    public int f65516f;

    /* renamed from: g, reason: collision with root package name */
    public int f65517g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f65518h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f65519i;

    /* renamed from: j, reason: collision with root package name */
    public long f65520j;

    /* renamed from: k, reason: collision with root package name */
    public int f65521k;

    /* renamed from: l, reason: collision with root package name */
    public long f65522l;

    public q() {
        this(null);
    }

    public final void a(io.odeeo.internal.q0.x xVar) {
        byte[] data = xVar.getData();
        int iLimit = xVar.limit();
        for (int position = xVar.getPosition(); position < iLimit; position++) {
            byte b10 = data[position];
            boolean z10 = (b10 & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) == 255;
            boolean z11 = this.f65519i && (b10 & 224) == 224;
            this.f65519i = z10;
            if (z11) {
                xVar.setPosition(position + 1);
                this.f65519i = false;
                this.f65511a.getData()[1] = data[position];
                this.f65517g = 2;
                this.f65516f = 1;
                return;
            }
        }
        xVar.setPosition(iLimit);
    }

    @RequiresNonNull({"output"})
    public final void b(io.odeeo.internal.q0.x xVar) {
        int iMin = Math.min(xVar.bytesLeft(), this.f65521k - this.f65517g);
        this.f65514d.sampleData(xVar, iMin);
        int i10 = this.f65517g + iMin;
        this.f65517g = i10;
        int i11 = this.f65521k;
        if (i10 < i11) {
            return;
        }
        long j10 = this.f65522l;
        if (j10 != C.TIME_UNSET) {
            this.f65514d.sampleMetadata(j10, 1, i11, 0, null);
            this.f65522l += this.f65520j;
        }
        this.f65517g = 0;
        this.f65516f = 0;
    }

    @RequiresNonNull({"output"})
    public final void c(io.odeeo.internal.q0.x xVar) {
        int iMin = Math.min(xVar.bytesLeft(), 4 - this.f65517g);
        xVar.readBytes(this.f65511a.getData(), this.f65517g, iMin);
        int i10 = this.f65517g + iMin;
        this.f65517g = i10;
        if (i10 < 4) {
            return;
        }
        this.f65511a.setPosition(0);
        if (!this.f65512b.setForHeaderData(this.f65511a.readInt())) {
            this.f65517g = 0;
            this.f65516f = 1;
            return;
        }
        this.f65521k = this.f65512b.f63483c;
        if (!this.f65518h) {
            this.f65520j = (r8.f63487g * 1000000) / r8.f63484d;
            this.f65514d.format(new t.b().setId(this.f65515e).setSampleMimeType(this.f65512b.f63482b).setMaxInputSize(4096).setChannelCount(this.f65512b.f63485e).setSampleRate(this.f65512b.f63484d).setLanguage(this.f65513c).build());
            this.f65518h = true;
        }
        this.f65511a.setPosition(0);
        this.f65514d.sampleData(this.f65511a, 4);
        this.f65516f = 2;
    }

    @Override // io.odeeo.internal.p.j
    public void consume(io.odeeo.internal.q0.x xVar) {
        io.odeeo.internal.q0.a.checkStateNotNull(this.f65514d);
        while (xVar.bytesLeft() > 0) {
            int i10 = this.f65516f;
            if (i10 == 0) {
                a(xVar);
            } else if (i10 == 1) {
                c(xVar);
            } else {
                if (i10 != 2) {
                    throw new IllegalStateException();
                }
                b(xVar);
            }
        }
    }

    @Override // io.odeeo.internal.p.j
    public void createTracks(io.odeeo.internal.g.j jVar, d0.d dVar) {
        dVar.generateNewId();
        this.f65515e = dVar.getFormatId();
        this.f65514d = jVar.track(dVar.getTrackId(), 1);
    }

    @Override // io.odeeo.internal.p.j
    public void packetStarted(long j10, int i10) {
        if (j10 != C.TIME_UNSET) {
            this.f65522l = j10;
        }
    }

    @Override // io.odeeo.internal.p.j
    public void seek() {
        this.f65516f = 0;
        this.f65517g = 0;
        this.f65519i = false;
        this.f65522l = C.TIME_UNSET;
    }

    public q(String str) {
        this.f65516f = 0;
        io.odeeo.internal.q0.x xVar = new io.odeeo.internal.q0.x(4);
        this.f65511a = xVar;
        xVar.getData()[0] = -1;
        this.f65512b = new r.a();
        this.f65522l = C.TIME_UNSET;
        this.f65513c = str;
    }

    @Override // io.odeeo.internal.p.j
    public void packetFinished() {
    }
}
