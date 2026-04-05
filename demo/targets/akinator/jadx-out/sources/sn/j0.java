package sn;

import java.util.UUID;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class j0 implements nn.b {

    /* renamed from: c, reason: collision with root package name */
    public static final boolean f85988c;

    /* renamed from: a, reason: collision with root package name */
    public final UUID f85989a;

    /* renamed from: b, reason: collision with root package name */
    public final byte[] f85990b;

    /* JADX WARN: Removed duplicated region for block: B:9:0x001e  */
    static {
        /*
            java.lang.String r0 = "Amazon"
            java.lang.String r1 = android.os.Build.MANUFACTURER
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L1e
            java.lang.String r0 = android.os.Build.MODEL
            java.lang.String r1 = "AFTM"
            boolean r1 = r1.equals(r0)
            if (r1 != 0) goto L1c
            java.lang.String r1 = "AFTB"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L1e
        L1c:
            r0 = 1
            goto L1f
        L1e:
            r0 = 0
        L1f:
            sn.j0.f85988c = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: sn.j0.<clinit>():void");
    }

    public j0(UUID uuid, byte[] bArr) {
        this(uuid, bArr, false);
    }

    @Deprecated
    public j0(UUID uuid, byte[] bArr, boolean z10) {
        this.f85989a = uuid;
        this.f85990b = bArr;
    }
}
