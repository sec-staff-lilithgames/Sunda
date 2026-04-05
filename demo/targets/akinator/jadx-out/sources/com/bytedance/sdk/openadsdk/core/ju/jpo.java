package com.bytedance.sdk.openadsdk.core.ju;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.ImageDecoder;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.TextUtils;
import android.widget.ImageView;
import com.bytedance.adsdk.ugeno.jpo;
import com.bytedance.adsdk.ugeno.zz.cm.a;
import com.bytedance.sdk.component.my.hna;
import com.bytedance.sdk.component.my.ju;
import com.bytedance.sdk.component.my.yd;
import com.bytedance.sdk.component.utils.nmd;
import com.bytedance.sdk.component.utils.qk;
import com.bytedance.sdk.component.xyk.xyk;
import com.bytedance.sdk.openadsdk.core.sq;
import com.bytedance.sdk.openadsdk.utils.duq;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.nio.ByteBuffer;
import java.util.Map;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class jpo implements com.bytedance.adsdk.ugeno.jpo {

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class jd implements hna {

        /* renamed from: cm, reason: collision with root package name */
        private final int f20539cm;

        /* renamed from: jd, reason: collision with root package name */
        private final jpo f20540jd;
        private final WeakReference<ImageView> jpo;
        private final int wqx;

        public jd(ImageView imageView, jpo jpoVar, int i10, int i11) {
            this.jpo = new WeakReference<>(imageView);
            this.f20540jd = jpoVar;
            this.wqx = i10;
            this.f20539cm = i11;
        }

        @Override // com.bytedance.sdk.component.my.hna
        public void jpo(int i10, String str, Throwable th2) {
        }

        @Override // com.bytedance.sdk.component.my.hna
        public void jpo(ju juVar) {
            try {
                final ImageView imageView = this.jpo.get();
                if (imageView == null) {
                    return;
                }
                final Object objJd = juVar.jd();
                if (objJd instanceof Drawable) {
                    duq.jpo((Runnable) new xyk("load_draw_img") { // from class: com.bytedance.sdk.openadsdk.core.ju.jpo.jd.1
                        @Override // java.lang.Runnable
                        public void run() {
                            if (Build.VERSION.SDK_INT >= 28) {
                                Object obj = objJd;
                                if (a.d(obj)) {
                                    a.b(obj).start();
                                }
                            }
                            imageView.setImageDrawable((Drawable) objJd);
                        }
                    });
                    return;
                }
                if (!(objJd instanceof byte[])) {
                    if (objJd instanceof Bitmap) {
                        duq.jpo((Runnable) new xyk("ug_load_bitmap") { // from class: com.bytedance.sdk.openadsdk.core.ju.jpo.jd.3
                            @Override // java.lang.Runnable
                            public void run() {
                                imageView.setImageBitmap((Bitmap) objJd);
                            }
                        });
                    }
                } else {
                    if (juVar.my()) {
                        if (Build.VERSION.SDK_INT <= 30) {
                            this.f20540jd.jpo((byte[]) objJd, imageView);
                            return;
                        } else {
                            this.f20540jd.jpo(imageView, (byte[]) objJd, this.wqx, this.f20539cm);
                            return;
                        }
                    }
                    if (this.f20540jd.jpo((byte[]) objJd)) {
                        this.f20540jd.jpo(imageView, (byte[]) objJd, this.wqx, this.f20539cm);
                        return;
                    }
                    final Bitmap bitmapJpo = new com.bytedance.sdk.component.my.cm.wqx.jd.jd(this.wqx, this.f20539cm, imageView.getScaleType(), Bitmap.Config.RGB_565, this.wqx, this.f20539cm).jpo((byte[]) objJd);
                    if (bitmapJpo != null) {
                        duq.jpo((Runnable) new xyk("load_static_img") { // from class: com.bytedance.sdk.openadsdk.core.ju.jpo.jd.2
                            @Override // java.lang.Runnable
                            public void run() {
                                imageView.setImageBitmap(bitmapJpo);
                            }
                        });
                    }
                }
            } catch (Throwable th2) {
                nmd.wqx("ImageLoaderProvider", th2.getMessage());
            }
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: com.bytedance.sdk.openadsdk.core.ju.jpo$jpo, reason: collision with other inner class name */
    public interface InterfaceC0129jpo {
        void jpo(Drawable drawable);
    }

    private void jd(final ImageView imageView, byte[] bArr, int i10, int i11) {
        final Bitmap bitmapJpo = new com.bytedance.sdk.component.my.cm.wqx.jd.jd(i10, i11, imageView.getScaleType(), Bitmap.Config.ARGB_4444, i10, i11).jpo(bArr);
        if (bitmapJpo != null) {
            duq.jpo((Runnable) new xyk("loadStaticImage") { // from class: com.bytedance.sdk.openadsdk.core.ju.jpo.2
                @Override // java.lang.Runnable
                public void run() {
                    imageView.setImageBitmap(bitmapJpo);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Drawable jd(byte[] bArr) {
        FileOutputStream fileOutputStream;
        try {
            boolean zWqx = com.bytedance.sdk.openadsdk.multipro.jd.wqx();
            File fileJpo = qk.jpo(sq.jpo(), zWqx, zWqx ? "UGEN_GIF_AD_CACHE/" : "/UGEN_GIF_CACHE/", "TT_UGEN_GIF_FILE");
            fileOutputStream = new FileOutputStream(fileJpo);
            try {
                fileOutputStream.write(bArr, 0, bArr.length);
                if (Build.VERSION.SDK_INT >= 28) {
                    Drawable drawableDecodeDrawable = ImageDecoder.decodeDrawable(ImageDecoder.createSource(fileJpo));
                    try {
                        fileOutputStream.close();
                    } catch (Throwable unused) {
                    }
                    return drawableDecodeDrawable;
                }
                BitmapDrawable bitmapDrawable = new BitmapDrawable(sq.jpo().getResources(), BitmapFactory.decodeByteArray(bArr, 0, bArr.length));
                try {
                    fileOutputStream.close();
                } catch (Throwable unused2) {
                }
                return bitmapDrawable;
            } catch (Throwable th2) {
                th = th2;
                try {
                    nmd.jpo("ImageLoaderProvider", "GifView  getSourceByFile fail : ", th);
                    if (fileOutputStream != null) {
                        try {
                            fileOutputStream.close();
                        } catch (Throwable unused3) {
                        }
                    }
                    return null;
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
            fileOutputStream = null;
        }
    }

    @Override // com.bytedance.adsdk.ugeno.jpo
    public void jpo(com.bytedance.adsdk.ugeno.core.ju juVar, String str, ImageView imageView, int i10, int i11, jpo.InterfaceC0064jpo interfaceC0064jpo) {
        String strJpo = wqx.jpo(str);
        yd ydVarWqx = com.bytedance.sdk.openadsdk.zz.cm.jpo(strJpo).wqx(1);
        jpo(juVar, ydVarWqx, strJpo);
        ydVarWqx.jpo(new jd(imageView, this, i10, i11), 4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void jpo(final ImageView imageView, byte[] bArr, int i10, int i11) throws IOException {
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr);
        if (Build.VERSION.SDK_INT >= 28) {
            try {
                final Drawable drawableDecodeDrawable = ImageDecoder.decodeDrawable(ImageDecoder.createSource(byteBufferWrap));
                if (drawableDecodeDrawable != null) {
                    duq.jpo((Runnable) new xyk("loadAnimatedDrawable") { // from class: com.bytedance.sdk.openadsdk.core.ju.jpo.1
                        @Override // java.lang.Runnable
                        public void run() {
                            Drawable drawable = drawableDecodeDrawable;
                            if (a.d(drawable)) {
                                a.b(drawable).start();
                            }
                            imageView.setImageDrawable(drawableDecodeDrawable);
                        }
                    });
                    return;
                }
                return;
            } catch (IOException e10) {
                nmd.wqx("ImageLoaderProvider", e10.getMessage());
                return;
            }
        }
        jd(imageView, bArr, i10, i11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void jpo(byte[] bArr, final ImageView imageView) {
        try {
            jpo(bArr, new InterfaceC0129jpo() { // from class: com.bytedance.sdk.openadsdk.core.ju.jpo.3
                @Override // com.bytedance.sdk.openadsdk.core.ju.jpo.InterfaceC0129jpo
                public void jpo(final Drawable drawable) {
                    duq.jpo(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.ju.jpo.3.1
                        @Override // java.lang.Runnable
                        public void run() {
                            if (Build.VERSION.SDK_INT >= 28) {
                                Drawable drawable2 = drawable;
                                if (a.d(drawable2)) {
                                    a.b(drawable2).start();
                                }
                            }
                            imageView.setImageDrawable(drawable);
                        }
                    });
                }
            });
        } catch (Exception e10) {
            nmd.wqx("ImageLoaderProvider", e10.getMessage());
        }
    }

    private void jpo(final byte[] bArr, final InterfaceC0129jpo interfaceC0129jpo) {
        duq.jd(new xyk("pag_animation_drawable") { // from class: com.bytedance.sdk.openadsdk.core.ju.jpo.4
            @Override // java.lang.Runnable
            public void run() {
                Drawable drawableJd = jpo.this.jd(bArr);
                InterfaceC0129jpo interfaceC0129jpo2 = interfaceC0129jpo;
                if (interfaceC0129jpo2 != null) {
                    interfaceC0129jpo2.jpo(drawableJd);
                }
            }
        });
    }

    public void jd(com.bytedance.adsdk.ugeno.core.ju juVar, String str, final jpo.InterfaceC0064jpo interfaceC0064jpo) {
        yd ydVarWqx = com.bytedance.sdk.openadsdk.zz.cm.jpo(str).wqx(2);
        jpo(juVar, ydVarWqx, str);
        ydVarWqx.jpo(new hna() { // from class: com.bytedance.sdk.openadsdk.core.ju.jpo.5
            @Override // com.bytedance.sdk.component.my.hna
            public void jpo(ju juVar2) {
                if (juVar2 == null) {
                    interfaceC0064jpo.jpo(null);
                    return;
                }
                if (interfaceC0064jpo != null) {
                    Object objJd = juVar2.jd();
                    if (objJd instanceof Bitmap) {
                        interfaceC0064jpo.jpo((Bitmap) objJd);
                        return;
                    }
                    if (juVar2.jd() instanceof byte[]) {
                        try {
                            interfaceC0064jpo.jpo(BitmapFactory.decodeByteArray((byte[]) juVar2.jd(), 0, ((byte[]) juVar2.jd()).length));
                            return;
                        } catch (Throwable unused) {
                        }
                    }
                    interfaceC0064jpo.jpo(null);
                }
            }

            @Override // com.bytedance.sdk.component.my.hna
            public void jpo(int i10, String str2, Throwable th2) {
                jpo.InterfaceC0064jpo interfaceC0064jpo2 = interfaceC0064jpo;
                if (interfaceC0064jpo2 != null) {
                    interfaceC0064jpo2.jpo(null);
                }
            }
        }, 4);
    }

    public boolean jpo(byte[] bArr) {
        return com.bytedance.sdk.component.utils.ju.jpo(bArr, 0);
    }

    @Override // com.bytedance.adsdk.ugeno.jpo
    public void jpo(com.bytedance.adsdk.ugeno.core.ju juVar, String str, jpo.InterfaceC0064jpo interfaceC0064jpo) {
        jd(juVar, wqx.jpo(str), interfaceC0064jpo);
    }

    private void jpo(com.bytedance.adsdk.ugeno.core.ju juVar, yd ydVar, String str) {
        Map<String, Object> mapJd;
        if (juVar == null || (mapJd = juVar.jd()) == null) {
            return;
        }
        Object obj = mapJd.get("image_info");
        if (obj instanceof Map) {
            ydVar.jpo((String) ((Map) obj).get(str));
        }
        String str2 = (String) mapJd.get("cache_dir");
        if (TextUtils.isEmpty(str2)) {
            return;
        }
        ydVar.jd(str2);
    }
}
