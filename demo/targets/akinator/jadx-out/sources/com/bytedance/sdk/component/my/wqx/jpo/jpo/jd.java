package com.bytedance.sdk.component.my.wqx.jpo.jpo;

import android.util.Log;
import com.bytedance.sdk.component.my.wqx.jpo.jpo.jpo;
import com.bytedance.sdk.component.utils.yd;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.concurrent.ExecutorService;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class jd implements com.bytedance.sdk.component.my.wqx {

    /* renamed from: jd, reason: collision with root package name */
    private jpo f18909jd;
    private long jpo;

    public jd(File file, long j10, ExecutorService executorService) {
        this.jpo = j10;
        try {
            this.f18909jd = jpo.jpo(file, 20210302, 1, j10, executorService);
        } catch (IOException e10) {
            Log.w("LruCountDiskCache", e10.toString());
        }
    }

    @Override // com.bytedance.sdk.component.my.jpo
    /* renamed from: wqx, reason: merged with bridge method [inline-methods] */
    public boolean jd(String str) throws IOException {
        try {
            try {
                jpo.wqx wqxVarJpo = this.f18909jd.jpo(str);
                boolean z10 = wqxVarJpo != null;
                yd.jpo(wqxVarJpo);
                return z10;
            } catch (IOException e10) {
                Log.w("LruCountDiskCache", e10.getMessage());
                yd.jpo(null);
                return false;
            }
        } catch (Throwable th2) {
            yd.jpo(null);
            throw th2;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v5, types: [java.io.Closeable, java.io.InputStream] */
    @Override // com.bytedance.sdk.component.my.jpo
    /* renamed from: jd, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public byte[] jpo(String str) throws Throwable {
        Closeable closeable;
        Closeable closeable2;
        ByteArrayOutputStream byteArrayOutputStream;
        jpo jpoVar = this.f18909jd;
        Closeable closeable3 = null;
        if (jpoVar != null) {
            try {
                if (str != 0) {
                    try {
                        jpo.wqx wqxVarJpo = jpoVar.jpo((String) str);
                        if (wqxVarJpo == null) {
                            yd.jpo(null);
                            yd.jpo(null);
                            return null;
                        }
                        str = wqxVarJpo.jpo(0);
                        if (str != 0) {
                            try {
                                byteArrayOutputStream = new ByteArrayOutputStream();
                                try {
                                    byte[] bArr = new byte[1024];
                                    while (true) {
                                        int i10 = str.read(bArr);
                                        if (i10 == -1) {
                                            break;
                                        }
                                        byteArrayOutputStream.write(bArr, 0, i10);
                                    }
                                } catch (IOException e10) {
                                    e = e10;
                                    closeable2 = str;
                                    Log.w("LruCountDiskCache", e.toString());
                                    yd.jpo(closeable2);
                                    yd.jpo(byteArrayOutputStream);
                                    return null;
                                }
                            } catch (IOException e11) {
                                e = e11;
                                byteArrayOutputStream = null;
                                closeable2 = str;
                                Log.w("LruCountDiskCache", e.toString());
                                yd.jpo(closeable2);
                                yd.jpo(byteArrayOutputStream);
                                return null;
                            } catch (Throwable th2) {
                                th = th2;
                                closeable = null;
                                closeable3 = str;
                                yd.jpo(closeable3);
                                yd.jpo(closeable);
                                throw th;
                            }
                        } else {
                            byteArrayOutputStream = null;
                        }
                        byte[] byteArray = byteArrayOutputStream.toByteArray();
                        yd.jpo(str);
                        yd.jpo(byteArrayOutputStream);
                        return byteArray;
                    } catch (IOException e12) {
                        e = e12;
                        closeable2 = null;
                        byteArrayOutputStream = null;
                    } catch (Throwable th3) {
                        th = th3;
                        closeable = null;
                        yd.jpo(closeable3);
                        yd.jpo(closeable);
                        throw th;
                    }
                }
            } catch (Throwable th4) {
                th = th4;
            }
        }
        return null;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.bytedance.sdk.component.my.wqx
    public InputStream jpo(String str) throws Throwable {
        jpo jpoVar = this.f18909jd;
        if (jpoVar == null) {
            return null;
        }
        try {
            jpo.wqx wqxVarJpo = jpoVar.jpo(str);
            if (wqxVarJpo != null) {
                return wqxVarJpo.jpo(0);
            }
        } catch (IOException e10) {
            Log.w("LruCountDiskCache", e10.getMessage());
        }
        return null;
    }

    @Override // com.bytedance.sdk.component.my.jpo
    public boolean jpo(String str, byte[] bArr) throws Throwable {
        Closeable closeable;
        jpo.C0088jpo c0088jpoJd;
        jpo jpoVar = this.f18909jd;
        if (jpoVar == null || bArr == null || str == null) {
            return false;
        }
        Closeable closeable2 = null;
        jpo.C0088jpo c0088jpo = null;
        try {
            try {
                c0088jpoJd = jpoVar.jd(str);
            } catch (IOException e10) {
                e = e10;
                closeable = null;
            }
            try {
                if (c0088jpoJd == null) {
                    Log.w("LruCountDiskCache", "save " + str + " failed for edit null");
                    yd.jpo(null);
                    return false;
                }
                OutputStream outputStreamJpo = c0088jpoJd.jpo(0);
                if (outputStreamJpo == jpo.wqx) {
                    Log.w("LruCountDiskCache", "save " + str + " failed for null OutputStream");
                    yd.jpo(outputStreamJpo);
                    return false;
                }
                outputStreamJpo.write(bArr);
                c0088jpoJd.jpo();
                this.f18909jd.jpo();
                yd.jpo(outputStreamJpo);
                return true;
            } catch (IOException e11) {
                e = e11;
                closeable = null;
                c0088jpo = c0088jpoJd;
                try {
                    Log.w("LruCountDiskCache", e.toString());
                    if (c0088jpo != null) {
                        try {
                            c0088jpo.jd();
                        } catch (IOException unused) {
                        }
                    }
                    yd.jpo(closeable);
                    return false;
                } catch (Throwable th2) {
                    th = th2;
                    closeable2 = closeable;
                    yd.jpo(closeable2);
                    throw th;
                }
            }
        } catch (Throwable th3) {
            th = th3;
            yd.jpo(closeable2);
            throw th;
        }
    }
}
