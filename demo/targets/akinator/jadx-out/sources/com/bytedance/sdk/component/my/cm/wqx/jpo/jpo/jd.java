package com.bytedance.sdk.component.my.cm.wqx.jpo.jpo;

import com.bytedance.sdk.component.my.wqx;
import com.bytedance.sdk.component.utils.yd;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class jd implements wqx {

    /* renamed from: jd, reason: collision with root package name */
    private jpo f18826jd;
    private int jpo;

    public jd(File file, long j10) {
        int i10 = (int) j10;
        this.jpo = i10;
        this.f18826jd = jpo.jpo(i10, file);
    }

    @Override // com.bytedance.sdk.component.my.jpo
    /* renamed from: wqx, reason: merged with bridge method [inline-methods] */
    public boolean jd(String str) throws IOException {
        try {
            InputStream inputStreamJpo = this.f18826jd.jpo(str);
            boolean z10 = inputStreamJpo != null;
            yd.jpo(inputStreamJpo);
            return z10;
        } catch (Throwable th2) {
            try {
                th2.getMessage();
                return false;
            } finally {
                yd.jpo(null);
            }
        }
    }

    @Override // com.bytedance.sdk.component.my.jpo
    /* renamed from: jd, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public byte[] jpo(String str) throws Throwable {
        ByteArrayOutputStream byteArrayOutputStream;
        Throwable th2;
        InputStream inputStreamJpo;
        jpo jpoVar = this.f18826jd;
        if (jpoVar != null && str != null) {
            try {
                inputStreamJpo = jpoVar.jpo(str);
                if (inputStreamJpo != null) {
                    try {
                        byteArrayOutputStream = new ByteArrayOutputStream();
                        try {
                            byte[] bArr = new byte[1024];
                            while (true) {
                                int i10 = inputStreamJpo.read(bArr);
                                if (i10 == -1) {
                                    break;
                                }
                                byteArrayOutputStream.write(bArr, 0, i10);
                            }
                        } catch (IOException unused) {
                        } catch (Throwable th3) {
                            th2 = th3;
                            yd.jpo(inputStreamJpo);
                            yd.jpo(byteArrayOutputStream);
                            throw th2;
                        }
                    } catch (IOException unused2) {
                        byteArrayOutputStream = null;
                    } catch (Throwable th4) {
                        th2 = th4;
                        byteArrayOutputStream = null;
                        yd.jpo(inputStreamJpo);
                        yd.jpo(byteArrayOutputStream);
                        throw th2;
                    }
                } else {
                    byteArrayOutputStream = null;
                }
                if (byteArrayOutputStream != null) {
                    byte[] byteArray = byteArrayOutputStream.toByteArray();
                    yd.jpo(inputStreamJpo);
                    yd.jpo(byteArrayOutputStream);
                    return byteArray;
                }
            } catch (IOException unused3) {
                inputStreamJpo = null;
                byteArrayOutputStream = null;
            } catch (Throwable th5) {
                byteArrayOutputStream = null;
                th2 = th5;
                inputStreamJpo = null;
            }
            yd.jpo(inputStreamJpo);
            yd.jpo(byteArrayOutputStream);
        }
        return null;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.bytedance.sdk.component.my.wqx
    public InputStream jpo(String str) {
        jpo jpoVar = this.f18826jd;
        if (jpoVar == null) {
            return null;
        }
        return jpoVar.jpo(str);
    }

    @Override // com.bytedance.sdk.component.my.jpo
    public boolean jpo(String str, byte[] bArr) {
        jpo jpoVar = this.f18826jd;
        if (jpoVar == null || bArr == null || str == null) {
            return false;
        }
        return jpoVar.jpo(str, bArr);
    }
}
