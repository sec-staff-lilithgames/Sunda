package com.mbridge.msdk.video.dynview.util.draw;

import android.graphics.Bitmap;
import android.text.TextUtils;
import android.view.View;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.tools.SameMD5;
import com.mbridge.msdk.foundation.tools.p0;
import com.mbridge.msdk.foundation.tools.z;
import com.mbridge.msdk.video.dynview.c;
import com.mbridge.msdk.video.dynview.shape.a;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public class a {

    /* renamed from: d, reason: collision with root package name */
    private static volatile a f44490d;

    /* renamed from: a, reason: collision with root package name */
    private View f44491a;

    /* renamed from: b, reason: collision with root package name */
    private Bitmap f44492b;

    /* renamed from: c, reason: collision with root package name */
    private Bitmap f44493c;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: com.mbridge.msdk.video.dynview.util.draw.a$a, reason: collision with other inner class name */
    public class RunnableC0346a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Bitmap f44494a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f44495b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ float f44496c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ float f44497d;

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        /* renamed from: com.mbridge.msdk.video.dynview.util.draw.a$a$a, reason: collision with other inner class name */
        public class RunnableC0347a implements Runnable {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ a.b f44499a;

            public RunnableC0347a(a.b bVar) {
                this.f44499a = bVar;
            }

            @Override // java.lang.Runnable
            public void run() {
                if (a.this.f44491a == null || this.f44499a.a() == null) {
                    return;
                }
                a.this.f44491a.setBackground(this.f44499a.a());
            }
        }

        public RunnableC0346a(Bitmap bitmap, int i10, float f10, float f11) {
            this.f44494a = bitmap;
            this.f44495b = i10;
            this.f44496c = f10;
            this.f44497d = f11;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                Bitmap bitmapA = z.a(this.f44494a, 10);
                Bitmap bitmapA2 = z.a(this.f44494a, 10);
                a.b bVarA = com.mbridge.msdk.video.dynview.shape.a.a();
                bVarA.a(this.f44495b).b(bitmapA).a(bitmapA2);
                if (this.f44495b == 2) {
                    float f10 = this.f44496c;
                    float f11 = this.f44497d;
                    if (f10 > f11) {
                        bVarA.b(f10).a(this.f44497d);
                    } else {
                        bVarA.b(f11).a(this.f44496c);
                    }
                } else {
                    bVarA.b(this.f44496c).a(this.f44497d);
                }
                if (a.this.f44491a != null) {
                    a.this.f44491a.post(new RunnableC0347a(bVarA));
                }
            } catch (Exception e10) {
                p0.b("ChoiceOneDrawBitBg", e10.getMessage());
            }
        }
    }

    private a() {
    }

    public void b() {
        if (this.f44491a != null) {
            this.f44491a = null;
        }
        Bitmap bitmap = this.f44492b;
        if (bitmap != null && !bitmap.isRecycled()) {
            this.f44492b.recycle();
            this.f44492b = null;
        }
        Bitmap bitmap2 = this.f44493c;
        if (bitmap2 == null || bitmap2.isRecycled()) {
            return;
        }
        this.f44493c.recycle();
        this.f44493c = null;
    }

    public static a a() {
        a aVar;
        if (f44490d != null) {
            return f44490d;
        }
        synchronized (a.class) {
            try {
                if (f44490d == null) {
                    f44490d = new a();
                }
                aVar = f44490d;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return aVar;
    }

    public void a(Map<String, Bitmap> map, c cVar, View view) {
        if (view == null || cVar == null || map == null || map.size() == 0 || map.size() < 2 || cVar.b() == null || cVar.b().size() < 2) {
            return;
        }
        this.f44491a = view;
        int iH = cVar.h();
        float fM = cVar.m();
        float fK = cVar.k();
        try {
            List<CampaignEx> listB = cVar.b();
            String md5 = listB.get(0) != null ? SameMD5.getMD5(listB.get(0).getImageUrl()) : "";
            String md52 = listB.get(1) != null ? SameMD5.getMD5(listB.get(1).getImageUrl()) : "";
            Bitmap bitmap = null;
            Bitmap bitmap2 = (TextUtils.isEmpty(md5) || !map.containsKey(md5)) ? null : map.get(md5);
            if (!TextUtils.isEmpty(md52) && map.containsKey(md52)) {
                bitmap = map.get(md52);
            }
            Bitmap bitmap3 = bitmap;
            if (bitmap2 == null || bitmap2.isRecycled() || bitmap3 == null || bitmap3.isRecycled()) {
                return;
            }
            a(iH, fM, fK, bitmap2, bitmap3);
        } catch (Exception e10) {
            p0.b("ChoiceOneDrawBitBg", e10.getMessage());
        }
    }

    private synchronized void a(int i10, float f10, float f11, Bitmap bitmap, Bitmap bitmap2) throws Throwable {
        try {
            try {
                try {
                    com.mbridge.msdk.foundation.same.threadpool.a.a().execute(new RunnableC0346a(bitmap, i10, f10, f11));
                } catch (Exception e10) {
                    e = e10;
                    p0.a("ChoiceOneDrawBitBg", e.getMessage());
                }
            } catch (Throwable th2) {
                th = th2;
                throw th;
            }
        } catch (Exception e11) {
            e = e11;
        } catch (Throwable th3) {
            th = th3;
            throw th;
        }
    }
}
