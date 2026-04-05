package qw;

import java.io.IOException;
import kotlin.jvm.internal.b1;
import tu.x0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final /* synthetic */ class r implements kv.p {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f83620b = 1;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ b1 f83621c;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ pw.k f83622e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ b1 f83623f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ b1 f83624g;

    public /* synthetic */ r(b1 b1Var, pw.k kVar, b1 b1Var2, b1 b1Var3) {
        this.f83621c = b1Var;
        this.f83622e = kVar;
        this.f83623f = b1Var2;
        this.f83624g = b1Var3;
    }

    @Override // kv.p
    public final Object invoke(Object obj, Object obj2) throws IOException {
        int i10 = this.f83620b;
        int iIntValue = ((Integer) obj).intValue();
        Long l9 = (Long) obj2;
        switch (i10) {
            case 0:
                long jLongValue = l9.longValue();
                if (iIntValue == 21589) {
                    if (jLongValue < 1) {
                        throw new IOException("bad zip: extended timestamp extra too short");
                    }
                    pw.k kVar = this.f83622e;
                    byte b10 = kVar.readByte();
                    boolean z10 = (b10 & 1) == 1;
                    boolean z11 = (b10 & 2) == 2;
                    boolean z12 = (b10 & 4) == 4;
                    long j10 = z10 ? 5L : 1L;
                    if (z11) {
                        j10 += 4;
                    }
                    if (z12) {
                        j10 += 4;
                    }
                    if (jLongValue < j10) {
                        throw new IOException("bad zip: extended timestamp extra too short");
                    }
                    if (z10) {
                        this.f83621c.f71816b = Integer.valueOf(kVar.readIntLe());
                    }
                    if (z11) {
                        this.f83623f.f71816b = Integer.valueOf(kVar.readIntLe());
                    }
                    if (z12) {
                        this.f83624g.f71816b = Integer.valueOf(kVar.readIntLe());
                    }
                }
                return x0.f87415a;
            default:
                long jLongValue2 = l9.longValue();
                if (iIntValue == 1) {
                    b1 b1Var = this.f83621c;
                    if (b1Var.f71816b != null) {
                        throw new IOException("bad zip: NTFS extra attribute tag 0x0001 repeated");
                    }
                    if (jLongValue2 != 24) {
                        throw new IOException("bad zip: NTFS extra attribute tag 0x0001 size != 24");
                    }
                    pw.k kVar2 = this.f83622e;
                    b1Var.f71816b = Long.valueOf(kVar2.readLongLe());
                    this.f83623f.f71816b = Long.valueOf(kVar2.readLongLe());
                    this.f83624g.f71816b = Long.valueOf(kVar2.readLongLe());
                }
                return x0.f87415a;
        }
    }

    public /* synthetic */ r(pw.k kVar, b1 b1Var, b1 b1Var2, b1 b1Var3) {
        this.f83622e = kVar;
        this.f83621c = b1Var;
        this.f83623f = b1Var2;
        this.f83624g = b1Var3;
    }
}
