package hf;

import android.graphics.Bitmap;
import androidx.core.app.NotificationCompat;
import com.google.android.exoplayer2.util.n1;
import com.google.android.exoplayer2.util.v0;
import ef.i;
import ef.j;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.zip.Inflater;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class a extends i {

    /* renamed from: n, reason: collision with root package name */
    public final v0 f58751n;

    /* renamed from: o, reason: collision with root package name */
    public final v0 f58752o;

    /* renamed from: p, reason: collision with root package name */
    public final C0578a f58753p;

    /* renamed from: q, reason: collision with root package name */
    public Inflater f58754q;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: hf.a$a, reason: collision with other inner class name */
    public static final class C0578a {

        /* renamed from: a, reason: collision with root package name */
        public final v0 f58755a = new v0();

        /* renamed from: b, reason: collision with root package name */
        public final int[] f58756b = new int[NotificationCompat.FLAG_LOCAL_ONLY];

        /* renamed from: c, reason: collision with root package name */
        public boolean f58757c;

        /* renamed from: d, reason: collision with root package name */
        public int f58758d;

        /* renamed from: e, reason: collision with root package name */
        public int f58759e;

        /* renamed from: f, reason: collision with root package name */
        public int f58760f;

        /* renamed from: g, reason: collision with root package name */
        public int f58761g;

        /* renamed from: h, reason: collision with root package name */
        public int f58762h;

        /* renamed from: i, reason: collision with root package name */
        public int f58763i;

        public ef.b build() {
            int unsignedByte;
            if (this.f58758d == 0 || this.f58759e == 0 || this.f58762h == 0 || this.f58763i == 0) {
                return null;
            }
            v0 v0Var = this.f58755a;
            if (v0Var.limit() == 0 || v0Var.getPosition() != v0Var.limit() || !this.f58757c) {
                return null;
            }
            v0Var.setPosition(0);
            int i10 = this.f58762h * this.f58763i;
            int[] iArr = new int[i10];
            int i11 = 0;
            while (i11 < i10) {
                int unsignedByte2 = v0Var.readUnsignedByte();
                int[] iArr2 = this.f58756b;
                if (unsignedByte2 != 0) {
                    unsignedByte = i11 + 1;
                    iArr[i11] = iArr2[unsignedByte2];
                } else {
                    int unsignedByte3 = v0Var.readUnsignedByte();
                    if (unsignedByte3 != 0) {
                        unsignedByte = ((unsignedByte3 & 64) == 0 ? unsignedByte3 & 63 : ((unsignedByte3 & 63) << 8) | v0Var.readUnsignedByte()) + i11;
                        Arrays.fill(iArr, i11, unsignedByte, (unsignedByte3 & 128) == 0 ? 0 : iArr2[v0Var.readUnsignedByte()]);
                    }
                }
                i11 = unsignedByte;
            }
            return new ef.a().setBitmap(Bitmap.createBitmap(iArr, this.f58762h, this.f58763i, Bitmap.Config.ARGB_8888)).setPosition(this.f58760f / this.f58758d).setPositionAnchor(0).setLine(this.f58761g / this.f58759e, 0).setLineAnchor(0).setSize(this.f58762h / this.f58758d).setBitmapHeight(this.f58763i / this.f58759e).build();
        }

        public void reset() {
            this.f58758d = 0;
            this.f58759e = 0;
            this.f58760f = 0;
            this.f58761g = 0;
            this.f58762h = 0;
            this.f58763i = 0;
            this.f58755a.reset(0);
            this.f58757c = false;
        }
    }

    public a() {
        super("PgsDecoder");
        this.f58751n = new v0();
        this.f58752o = new v0();
        this.f58753p = new C0578a();
    }

    @Override // ef.i
    public final j c(byte[] bArr, int i10, boolean z10) {
        ef.b bVarBuild;
        int position;
        int iLimit;
        int unsignedInt24;
        v0 v0Var = this.f58751n;
        v0Var.reset(bArr, i10);
        if (v0Var.bytesLeft() > 0 && v0Var.peekUnsignedByte() == 120) {
            if (this.f58754q == null) {
                this.f58754q = new Inflater();
            }
            Inflater inflater = this.f58754q;
            v0 v0Var2 = this.f58752o;
            if (n1.inflate(v0Var, v0Var2, inflater)) {
                v0Var.reset(v0Var2.getData(), v0Var2.limit());
            }
        }
        C0578a c0578a = this.f58753p;
        c0578a.reset();
        ArrayList arrayList = new ArrayList();
        while (v0Var.bytesLeft() >= 3) {
            int iLimit2 = v0Var.limit();
            int unsignedByte = v0Var.readUnsignedByte();
            int unsignedShort = v0Var.readUnsignedShort();
            int position2 = v0Var.getPosition() + unsignedShort;
            if (position2 > iLimit2) {
                v0Var.setPosition(iLimit2);
                bVarBuild = null;
            } else {
                char c10 = 128;
                if (unsignedByte != 128) {
                    switch (unsignedByte) {
                        case 20:
                            int[] iArr = c0578a.f58756b;
                            if (unsignedShort % 5 == 2) {
                                v0Var.skipBytes(2);
                                Arrays.fill(iArr, 0);
                                int i11 = unsignedShort / 5;
                                int i12 = 0;
                                while (i12 < i11) {
                                    int unsignedByte2 = v0Var.readUnsignedByte();
                                    char c11 = c10;
                                    int[] iArr2 = iArr;
                                    double unsignedByte3 = v0Var.readUnsignedByte();
                                    double unsignedByte4 = v0Var.readUnsignedByte() - 128;
                                    double unsignedByte5 = v0Var.readUnsignedByte() - 128;
                                    iArr2[unsignedByte2] = n1.constrainValue((int) ((unsignedByte5 * 1.772d) + unsignedByte3), 0, 255) | (v0Var.readUnsignedByte() << 24) | (n1.constrainValue((int) ((1.402d * unsignedByte4) + unsignedByte3), 0, 255) << 16) | (n1.constrainValue((int) ((unsignedByte3 - (0.34414d * unsignedByte5)) - (unsignedByte4 * 0.71414d)), 0, 255) << 8);
                                    i12++;
                                    c10 = c11;
                                    iArr = iArr2;
                                }
                                c0578a.f58757c = true;
                                break;
                            }
                            break;
                        case 21:
                            v0 v0Var3 = c0578a.f58755a;
                            if (unsignedShort >= 4) {
                                v0Var.skipBytes(3);
                                int i13 = unsignedShort - 4;
                                if (!((128 & v0Var.readUnsignedByte()) != 0)) {
                                    position = v0Var3.getPosition();
                                    iLimit = v0Var3.limit();
                                    if (position < iLimit && i13 > 0) {
                                        int iMin = Math.min(i13, iLimit - position);
                                        v0Var.readBytes(v0Var3.getData(), position, iMin);
                                        v0Var3.setPosition(position + iMin);
                                        break;
                                    }
                                } else if (i13 >= 7 && (unsignedInt24 = v0Var.readUnsignedInt24()) >= 4) {
                                    c0578a.f58762h = v0Var.readUnsignedShort();
                                    c0578a.f58763i = v0Var.readUnsignedShort();
                                    v0Var3.reset(unsignedInt24 - 4);
                                    i13 = unsignedShort - 11;
                                    position = v0Var3.getPosition();
                                    iLimit = v0Var3.limit();
                                    if (position < iLimit) {
                                        int iMin2 = Math.min(i13, iLimit - position);
                                        v0Var.readBytes(v0Var3.getData(), position, iMin2);
                                        v0Var3.setPosition(position + iMin2);
                                    }
                                }
                            }
                            break;
                        case 22:
                            if (unsignedShort >= 19) {
                                c0578a.f58758d = v0Var.readUnsignedShort();
                                c0578a.f58759e = v0Var.readUnsignedShort();
                                v0Var.skipBytes(11);
                                c0578a.f58760f = v0Var.readUnsignedShort();
                                c0578a.f58761g = v0Var.readUnsignedShort();
                                break;
                            }
                            break;
                    }
                    bVarBuild = null;
                } else {
                    bVarBuild = c0578a.build();
                    c0578a.reset();
                }
                v0Var.setPosition(position2);
            }
            if (bVarBuild != null) {
                arrayList.add(bVarBuild);
            }
        }
        return new b(Collections.unmodifiableList(arrayList));
    }
}
