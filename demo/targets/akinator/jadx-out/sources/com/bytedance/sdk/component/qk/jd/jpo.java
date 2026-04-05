package com.bytedance.sdk.component.qk.jd;

import android.text.TextUtils;
import com.bytedance.sdk.component.jd.jpo.Cif;
import com.bytedance.sdk.component.jd.jpo.ju;
import com.fyber.inneractive.sdk.player.exoplayer2.text.Ir.NyKZx;
import com.inmobi.unification.sdk.InitializationStatus;
import com.mbridge.msdk.foundation.download.Command;
import j1.o2;
import java.io.File;
import java.io.IOException;
import java.util.Map;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes2.dex */
public class jpo extends wqx {

    /* renamed from: jd, reason: collision with root package name */
    public File f18986jd;
    public File jpo;

    /* renamed from: yd, reason: collision with root package name */
    private volatile boolean f18987yd;

    public jpo(ju juVar) {
        super(juVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static long jj(Map<String, String> map) {
        String str = map.containsKey("content-length") ? map.get("content-length") : map.containsKey("Content-Length") ? map.get("Content-Length") : null;
        if (!TextUtils.isEmpty(str) && str != null) {
            try {
                return Long.valueOf(str).longValue();
            } catch (Throwable unused) {
            }
        }
        return 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean my(Map<String, String> map) {
        if (TextUtils.equals(map.get("Accept-Ranges"), "bytes") || TextUtils.equals(map.get("accept-ranges"), "bytes")) {
            return true;
        }
        String str = map.get("Content-Range");
        if (TextUtils.isEmpty(str)) {
            str = map.get("content-range");
        }
        return str != null && str.startsWith("bytes");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean qk(Map<String, String> map) {
        return TextUtils.equals(map.get("Content-Encoding"), "gzip");
    }

    @Override // com.bytedance.sdk.component.qk.jd.wqx
    public void jd() {
        this.f18987yd = true;
        super.jd();
    }

    public void jpo(String str, String str2) {
        File file = new File(str);
        if (file.isFile()) {
            file.delete();
        }
        if (!file.exists()) {
            file.mkdirs();
        }
        this.jpo = new File(str, str2);
        this.f18986jd = new File(str, o2.l(str2, ".temp"));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void my() {
        try {
            this.jpo.delete();
        } catch (Throwable unused) {
        }
        try {
            this.f18986jd.delete();
        } catch (Throwable unused2) {
        }
    }

    public void jpo(final com.bytedance.sdk.component.qk.jpo.jpo jpoVar) {
        File file = this.jpo;
        if (file == null || this.f18986jd == null) {
            if (jpoVar != null) {
                jpoVar.jpo(this, new IOException("File info is null, please exec setFileInfo(String dir, String fileName)"));
                return;
            }
            return;
        }
        if (file.exists() && this.jpo.length() != 0 && jpoVar != null) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            com.bytedance.sdk.component.qk.jd jdVar = new com.bytedance.sdk.component.qk.jd(true, 200, InitializationStatus.SUCCESS, null, null, jCurrentTimeMillis, jCurrentTimeMillis);
            jdVar.jpo(this.jpo);
            jpoVar.jpo(this, jdVar);
            return;
        }
        long length = this.f18986jd.length();
        final long j10 = length >= 0 ? length : 0L;
        Cif.jpo jpoVar2 = new Cif.jpo();
        jpoVar2.jpo((Object) wqx());
        jd(Command.HTTP_HEADER_RANGE, "bytes=" + j10 + NyKZx.mQy);
        if (TextUtils.isEmpty(this.xyk)) {
            jpoVar.jpo(this, new IOException("Url is Empty"));
            return;
        }
        try {
            jpoVar2.jd(this.xyk);
            if (!TextUtils.isEmpty(this.my)) {
                jpoVar2.jpo(this.my);
            }
            int i10 = this.f18990jj;
            if (i10 > 0) {
                jpoVar2.jpo(i10);
            }
            jpo(jpoVar2);
            com.bytedance.sdk.component.jd.jpo.jd jdVarJpo = this.wqx.jpo(jpoVar2.jpo().jd());
            if (jdVarJpo == null) {
                jpoVar.jpo(this, new IOException("new call error"));
            } else {
                jdVarJpo.jpo(new com.bytedance.sdk.component.jd.jpo.wqx() { // from class: com.bytedance.sdk.component.qk.jd.jpo.1
                    @Override // com.bytedance.sdk.component.jd.jpo.wqx
                    public void jpo(com.bytedance.sdk.component.jd.jpo.jd jdVar2, IOException iOException) {
                        com.bytedance.sdk.component.qk.jpo.jpo jpoVar3 = jpoVar;
                        if (jpoVar3 != null) {
                            jpoVar3.jpo(jpo.this, iOException);
                        }
                        jpo.this.my();
                    }

                    /* JADX WARN: Removed duplicated region for block: B:127:0x017f A[SYNTHETIC] */
                    /* JADX WARN: Removed duplicated region for block: B:54:0x014f A[Catch: all -> 0x013b, TryCatch #6 {all -> 0x013b, blocks: (B:44:0x0122, B:46:0x0130, B:48:0x0134, B:51:0x013e, B:52:0x0145, B:54:0x014f, B:56:0x015b, B:59:0x016c, B:62:0x0177, B:63:0x017e, B:58:0x0163, B:65:0x0181, B:67:0x0189, B:70:0x0195, B:72:0x019f, B:74:0x01ab, B:76:0x01b7, B:77:0x01c6, B:78:0x01d3, B:81:0x01ed), top: B:120:0x0122 }] */
                    @Override // com.bytedance.sdk.component.jd.jpo.wqx
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct add '--show-bad-code' argument
                    */
                    public void jpo(com.bytedance.sdk.component.jd.jpo.jd r21, com.bytedance.sdk.component.jd.jpo.oya r22) throws java.io.IOException {
                        /*
                            Method dump skipped, instructions count: 567
                            To view this dump add '--comments-level debug' option
                        */
                        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.component.qk.jd.jpo.AnonymousClass1.jpo(com.bytedance.sdk.component.jd.jpo.jd, com.bytedance.sdk.component.jd.jpo.oya):void");
                    }
                });
            }
        } catch (IllegalArgumentException unused) {
            jpoVar.jpo(this, new IOException("Url is not a valid HTTP or HTTPS URL"));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:188:0x01d6 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0133 A[PHI: r10
      0x0133: PHI (r10v4 long) = (r10v3 long), (r10v8 long) binds: [B:41:0x00f9, B:44:0x0108] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01a1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public com.bytedance.sdk.component.qk.jd jpo() {
        /*
            Method dump skipped, instructions count: 601
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.component.qk.jd.jpo.jpo():com.bytedance.sdk.component.qk.jd");
    }
}
