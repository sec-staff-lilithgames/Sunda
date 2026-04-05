package com.bytedance.sdk.component.my.cm.wqx.jd;

import android.graphics.ImageDecoder;
import android.graphics.drawable.Drawable;
import android.os.Build;
import com.bytedance.sdk.component.my.cm.wqx.jj;
import com.bytedance.sdk.component.utils.nmd;
import com.bytedance.sdk.component.utils.qk;
import java.io.File;
import java.io.FileOutputStream;
import java.nio.ByteBuffer;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class jpo {

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: com.bytedance.sdk.component.my.cm.wqx.jd.jpo$jpo, reason: collision with other inner class name */
    public interface InterfaceC0087jpo {
        void jpo();

        void jpo(Drawable drawable);

        void jpo(byte[] bArr);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void jd(byte[] bArr, jj jjVar, InterfaceC0087jpo interfaceC0087jpo) {
        FileOutputStream fileOutputStream = null;
        try {
            boolean zQk = jjVar.qk();
            File fileJpo = qk.jpo(jjVar.jpo(), zQk, zQk ? "P_GIF_MUTIL_CACHE/" : "/P_GIF_CACHE/", "P_U_GIF_FILE");
            FileOutputStream fileOutputStream2 = new FileOutputStream(fileJpo);
            try {
                fileOutputStream2.write(bArr, 0, bArr.length);
                if (Build.VERSION.SDK_INT < 28) {
                    if (interfaceC0087jpo != null) {
                        interfaceC0087jpo.jpo(bArr);
                    }
                    try {
                        fileOutputStream2.close();
                        return;
                    } catch (Throwable unused) {
                        return;
                    }
                }
                Drawable drawableDecodeDrawable = ImageDecoder.decodeDrawable(ImageDecoder.createSource(fileJpo));
                if (interfaceC0087jpo != null) {
                    interfaceC0087jpo.jpo(drawableDecodeDrawable);
                }
                try {
                    fileOutputStream2.close();
                } catch (Throwable unused2) {
                }
            } catch (Throwable th2) {
                th = th2;
                fileOutputStream = fileOutputStream2;
                try {
                    nmd.jpo("PAGGifDefaultDecoder", "Gif  getSourceByFile fail : ", th);
                    if (fileOutputStream != null) {
                        try {
                            fileOutputStream.close();
                        } catch (Throwable unused3) {
                        }
                    }
                    if (interfaceC0087jpo != null) {
                        interfaceC0087jpo.jpo();
                    }
                } catch (Throwable th3) {
                    if (fileOutputStream != null) {
                        try {
                            fileOutputStream.close();
                        } catch (Throwable unused4) {
                        }
                    }
                    throw th3;
                }
            }
        } catch (Throwable th4) {
            th = th4;
        }
    }

    public void jpo(byte[] bArr, jj jjVar, InterfaceC0087jpo interfaceC0087jpo) {
        if (Build.VERSION.SDK_INT <= 30) {
            jpo(bArr, interfaceC0087jpo, jjVar);
        } else {
            jpo(bArr, interfaceC0087jpo);
        }
    }

    public void jpo(byte[] bArr, InterfaceC0087jpo interfaceC0087jpo) {
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr);
        if (Build.VERSION.SDK_INT < 28) {
            if (interfaceC0087jpo != null) {
                interfaceC0087jpo.jpo(bArr);
                return;
            }
            return;
        }
        try {
            Drawable drawableDecodeDrawable = ImageDecoder.decodeDrawable(ImageDecoder.createSource(byteBufferWrap));
            if (interfaceC0087jpo != null) {
                interfaceC0087jpo.jpo(drawableDecodeDrawable);
            }
        } catch (Throwable th2) {
            nmd.wqx("PAGGifDefaultDecoder", th2.getMessage());
            if (interfaceC0087jpo != null) {
                interfaceC0087jpo.jpo();
            }
        }
    }

    private void jpo(final byte[] bArr, final InterfaceC0087jpo interfaceC0087jpo, final jj jjVar) {
        try {
            jjVar.xyk().submit(new Runnable() { // from class: com.bytedance.sdk.component.my.cm.wqx.jd.jpo.1
                @Override // java.lang.Runnable
                public void run() {
                    jpo.this.jd(bArr, jjVar, interfaceC0087jpo);
                }
            });
        } catch (Throwable th2) {
            nmd.wqx("PAGGifDefaultDecoder", th2.getMessage());
            if (interfaceC0087jpo != null) {
                interfaceC0087jpo.jpo();
            }
        }
    }
}
