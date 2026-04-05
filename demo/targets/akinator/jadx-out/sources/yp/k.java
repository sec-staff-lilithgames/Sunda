package yp;

import android.R;
import android.content.Context;
import android.graphics.Color;
import android.graphics.Rect;
import android.graphics.SurfaceTexture;
import android.media.MediaPlayer;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.Surface;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import com.google.android.exoplayer2.o0;
import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.Timer;
import vp.r;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public class k extends RelativeLayout implements MediaPlayer.OnCompletionListener, MediaPlayer.OnErrorListener, MediaPlayer.OnPreparedListener, MediaPlayer.OnVideoSizeChangedListener, TextureView.SurfaceTextureListener, q {
    public static k D;
    public int A;
    public boolean B;
    public int C;

    /* renamed from: b, reason: collision with root package name */
    public vp.o f94762b;

    /* renamed from: c, reason: collision with root package name */
    public r f94763c;

    /* renamed from: e, reason: collision with root package name */
    public vp.p f94764e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f94765f;

    /* renamed from: g, reason: collision with root package name */
    public ImageView f94766g;

    /* renamed from: h, reason: collision with root package name */
    public ProgressBar f94767h;

    /* renamed from: i, reason: collision with root package name */
    public ImageView f94768i;

    /* renamed from: j, reason: collision with root package name */
    public zm.a f94769j;

    /* renamed from: k, reason: collision with root package name */
    public MediaPlayer f94770k;

    /* renamed from: l, reason: collision with root package name */
    public TextureView f94771l;

    /* renamed from: m, reason: collision with root package name */
    public Timer f94772m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f94773n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f94774o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f94775p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f94776q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f94777r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f94778s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f94779t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f94780u;

    /* renamed from: v, reason: collision with root package name */
    public volatile boolean f94781v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f94782w;

    /* renamed from: x, reason: collision with root package name */
    public int f94783x;

    /* renamed from: y, reason: collision with root package name */
    public int f94784y;

    /* renamed from: z, reason: collision with root package name */
    public int f94785z;

    public k(Context context) {
        super(context);
        this.f94765f = false;
        this.f94775p = true;
        this.f94785z = 0;
        this.A = 0;
        this.B = true;
        this.C = 1;
    }

    public static void a(k kVar) throws IllegalStateException {
        if (kVar.f94770k != null) {
            try {
                if (!kVar.f94781v) {
                    if (kVar.f94770k.isPlaying()) {
                        kVar.f94770k.stop();
                    }
                    kVar.f94770k.reset();
                }
                kVar.f94770k.setOnCompletionListener(null);
                kVar.f94770k.setOnErrorListener(null);
                kVar.f94770k.setOnPreparedListener(null);
                kVar.f94770k.setOnVideoSizeChangedListener(null);
                kVar.f94770k.release();
            } catch (Exception e10) {
                nm.a.w(e10);
            }
            kVar.f94770k = null;
        }
    }

    public void applyNative(vp.o oVar, r rVar, vp.p pVar) {
        this.f94762b = oVar;
        this.f94763c = rVar;
        this.f94764e = pVar;
        if (((vp.l) rVar).getVideoUri() != null || !TextUtils.isEmpty(oVar.getVideoUrl()) || !TextUtils.isEmpty(oVar.getVideoAdm())) {
            this.f94780u = true;
        }
        if (!this.f94765f) {
            this.f94765f = true;
            ImageView imageView = new ImageView(getContext());
            this.f94766g = imageView;
            imageView.setLayoutParams(new RelativeLayout.LayoutParams(-1, -1));
            this.f94766g.setScaleType(ImageView.ScaleType.FIT_CENTER);
            this.f94766g.setAdjustViewBounds(true);
            addView(this.f94766g);
            if (this.f94780u) {
                int iRound = Math.round(nm.j.getScreenDensity(getContext()) * 50.0f);
                this.f94767h = new ProgressBar(getContext(), null, R.attr.progressBarStyleLarge);
                RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(iRound, iRound);
                layoutParams.addRule(13, -1);
                this.f94767h.setLayoutParams(layoutParams);
                this.f94767h.setBackgroundColor(Color.parseColor("#6b000000"));
                this.f94767h.setVisibility(4);
                addView(this.f94767h);
                ImageView imageView2 = new ImageView(getContext());
                this.f94768i = imageView2;
                imageView2.setImageResource(R.drawable.ic_media_play);
                RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(iRound, iRound);
                layoutParams2.addRule(13, -1);
                this.f94768i.setLayoutParams(layoutParams2);
                this.f94768i.setOnClickListener(new a(this));
                this.f94768i.setVisibility(4);
                addView(this.f94768i);
                TextureView textureView = new TextureView(getContext());
                this.f94771l = textureView;
                textureView.setSurfaceTextureListener(this);
                RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(-1, -1);
                layoutParams3.addRule(13);
                this.f94771l.setLayoutParams(layoutParams3);
                this.f94771l.setOnClickListener(new b(this));
                addView(this.f94771l);
                Context context = getContext();
                float screenDensity = nm.j.getScreenDensity(context);
                int iRound2 = Math.round(40.0f * screenDensity);
                int iRound3 = Math.round(screenDensity * 8.0f);
                zm.a aVar = new zm.a(context);
                this.f94769j = aVar;
                aVar.setColors(um.a.f88522a, um.a.f88523b);
                this.f94769j.setPadding(iRound3, iRound3, iRound3, iRound3);
                RelativeLayout.LayoutParams layoutParams4 = new RelativeLayout.LayoutParams(iRound2, iRound2);
                layoutParams4.addRule(9);
                layoutParams4.addRule(10);
                this.f94769j.setLayoutParams(layoutParams4);
                j();
                this.f94769j.setOnClickListener(new g(this));
                addView(this.f94769j);
                c();
                r rVar2 = this.f94763c;
                if (rVar2 != null && ((vp.l) rVar2).getVideoUri() != null && ((vp.l) this.f94763c).getVideoUri().getPath() != null && new File(((vp.l) this.f94763c).getVideoUri().getPath()).exists()) {
                    this.f94779t = true;
                } else if (this.f94762b != null) {
                    l(3);
                    if (!TextUtils.isEmpty(this.f94762b.getVideoUrl())) {
                        xp.f.getInstance().execute(new wp.j(getContext(), new c(this), this.f94762b.getVideoUrl()));
                    } else if (!TextUtils.isEmpty(this.f94762b.getVideoAdm())) {
                        xp.f.getInstance().execute(new wp.g(getContext(), new d(this), this.f94762b.getVideoAdm()));
                    }
                }
            } else {
                l(1);
            }
        }
        if (this.f94763c != null) {
            xp.e.fillImageView(getContext(), this.f94766g, ((vp.l) this.f94763c).getImageUri(), ((vp.l) this.f94763c).getImageDrawable());
        }
    }

    public final void b() {
        nm.j.onUiThread(new f(this));
    }

    public final void c() {
        MediaPlayer mediaPlayer = new MediaPlayer();
        this.f94770k = mediaPlayer;
        mediaPlayer.setOnCompletionListener(this);
        this.f94770k.setOnErrorListener(this);
        this.f94770k.setOnPreparedListener(this);
        this.f94770k.setOnVideoSizeChangedListener(this);
        this.f94770k.setAudioStreamType(3);
        if (d()) {
            if (this.f94775p) {
                this.f94770k.setVolume(0.0f, 0.0f);
            } else {
                this.f94770k.setVolume(1.0f, 1.0f);
            }
        }
    }

    public final boolean d() {
        return (this.f94781v || this.f94770k == null) ? false : true;
    }

    public final void e() {
        List<String> impressionUrlList;
        if (this.f94773n) {
            return;
        }
        r rVar = this.f94763c;
        if (rVar != null && ((vp.l) rVar).getVastRequest() != null && ((vp.l) this.f94763c).getVastRequest().getVastAd() != null && (impressionUrlList = ((vp.l) this.f94763c).getVastRequest().getVastAd().getImpressionUrlList()) != null) {
            Iterator<String> it = impressionUrlList.iterator();
            while (it.hasNext()) {
                nm.j.simpleTrackUrl(it.next(), xp.f.getInstance());
            }
        }
        this.f94773n = true;
        nm.a.d("MediaView: video started");
    }

    public final void f() throws IllegalStateException {
        try {
            if (d() && this.f94770k.isPlaying()) {
                this.f94770k.pause();
            }
            if (this.C != 3) {
                l(4);
            }
        } catch (Exception e10) {
            nm.a.w(e10);
        }
    }

    public final void g() throws IllegalStateException, IOException, SecurityException, IllegalArgumentException {
        r rVar;
        try {
            if (this.f94776q || (rVar = this.f94763c) == null || ((vp.l) rVar).getVideoUri() == null || this.f94777r || this.f94781v) {
                return;
            }
            this.f94770k.setDataSource(getContext(), ((vp.l) this.f94763c).getVideoUri());
            this.f94770k.prepareAsync();
            this.f94777r = true;
        } catch (Exception e10) {
            nm.a.w(e10);
        }
    }

    public final void h(io.bidmachine.iab.vast.a aVar) {
        vp.p pVar;
        List<String> list;
        r rVar = this.f94763c;
        if (rVar != null && ((vp.l) rVar).getVastRequest() != null && ((vp.l) this.f94763c).getVastRequest().getVastAd() != null && (list = ((vp.l) this.f94763c).getVastRequest().getVastAd().getTrackingEventListMap().get(aVar)) != null) {
            Iterator<String> it = list.iterator();
            while (it.hasNext()) {
                nm.j.simpleTrackUrl(it.next(), xp.f.getInstance());
            }
        }
        if (aVar != io.bidmachine.iab.vast.a.f60395h || (pVar = this.f94764e) == null) {
            return;
        }
        ((vp.l) pVar).dispatchVideoPlayFinished();
    }

    public final void i() throws IllegalStateException {
        try {
            if (this.f94770k == null) {
                c();
            }
            if (!this.f94776q) {
                g();
            }
            if (d() && this.f94776q && this.f94778s) {
                if (getGlobalVisibleRect(new Rect()) && isShown() && hasWindowFocus()) {
                    if (!this.f94770k.isPlaying()) {
                        this.f94770k.start();
                        e();
                        if (this.f94772m == null) {
                            startVideoVisibilityCheckerTimer();
                        }
                    }
                    if (this.f94770k.getCurrentPosition() <= 0 || this.C == 2) {
                        return;
                    }
                    l(2);
                }
            }
        } catch (Exception e10) {
            nm.a.w(e10);
            b();
        }
    }

    public final void j() {
        zm.a aVar = this.f94769j;
        if (aVar != null) {
            if (this.f94775p) {
                aVar.setImage(um.a.getBitmapFromBase64("iVBORw0KGgoAAAANSUhEUgAAAJAAAACQCAMAAADQmBKKAAAAwFBMVEUAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAALOy8QAAAAQHRSTlMAT5vPRxSr/1OTn4c4s9cYEMu/XwTDu3fbYwjvt+NA8wwg3/fHKOdLj/tbPDBv03+jl4sca2d7NCTrLINDr6dz72VdRQAAA8FJREFUeAHt2dWW6zgURdEd3GFmZqZi7O7//6rmW7ZiK2VHkYo8X0MreI5GENAiEAgEAoFAIBAIhSORcBSfRSzOf8VjOFMimUpncDFZ/i+XxzkKRZJkKYrLKJNKRZUq/xdJVKAONaoV1WlpNFtQ1qZaUYd23R5U9alUVOlTlBxATZVKRUMeG/WgpE61ojEF6i9SJaJWNKHTKAMF05lSUYgu+vMPLFrQxXJlpGhdLm/gsG3TxVZ/UbRLkrsejhX2bkkL3UVb/meZgLekQ0VrUb7P/43z8JZ0Ba1F67eia7i5qfFY01DRBO5uxxQte2aK2pCYFimaDc0UQaaSpCgyMFIEuT1FcZgowglbiu5MFOGU1ZJ27ZiBIpyUEIvC0F+E0+5pt3zQX4R3xGk3gfYivGOwo11TU5EPj23aPBVMFk0e4CJBuz0MFpHh2DvnT3YrBotIjjZweF7SZg5zRSQ5LsMhSZsslKV4XDSAK9kGXXiizRCKFnSouhdRVnRHmzQ8qzRrI0p4KZIO0VabllkFHuWLFPgukk+IJG1C8KhEqhXxl9EAoudzFv47UrGIbw6njv0ReFOjalGfb9YQlWlTgCdtqhatraISRK2x/w8Recmi0IkPaNp/kHpRCaIX/1sRL1s0hCBKy7LlP0i9aA9BgTYZfUHyohxEEVrKGoPkRTH5j/WtziBp0Vx+jt1rDZIVvcgHwZXeIElRHIIVLQe9QZKiEgQ9Wkp6gyRFOwg2vscrL1w0kv8TMtIYJC/KQXBDS1djkLxoqucVUijSH6RUtKZlpx6kXhTS8rVXKLqlJaUepF6UpOVaPUi9qErLncagmdeiPi2vGoOmHos2tIlpDILHojtautAZ5LEoS8tveoM8FbX6tNThSYPngLeikP9DB154DngpEq/RhjeFEc8A/0UHeDSN0D/4L1rBq0q92qdP8F00HkDNgqfAd9HvgM4i+C6KQmsR/BZ1Aa1F8Fv0B/QWwWdRrgC9RfBZNAD0FsFvETQX4bMV4bMV4bMV4bMV4bMV4bMV4bMV4ZMVtSHxyo8pKsLd/IkfU5SEm1iKFqNFy0c4VZpP5AcVNeEU2pE0XXQ3JsluAsdazRwtBosGq/19tIVjqyeSxovk7kl+pqIH8nMVxen01JxRlIQxT3So3jinyBqm8NjyvgI4ihYwpU9RceM6aaswpUO79l0FEIqMB73SMl4UZNvIAsak33KSefl+tIY5t22SnL2IOWJREia1Qvf3vRZcPE74r9QAn0TlNvvUiEcRCAQCgUAgEAgEdPgLbm7XQrhD8bcAAAAASUVORK5CYII="));
            } else {
                aVar.setImage(um.a.getBitmapFromBase64("iVBORw0KGgoAAAANSUhEUgAAAJAAAACQCAMAAADQmBKKAAAAw1BMVEUAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAABAcKsgAAAAQXRSTlMABFeXn38wGNP/u0AMw8tP11+/3/eTOPNH+0tnc3fvb+tDi49TEKMcY8drKCCvFJt7qyQ047eHCCw8g89bp9vns9m2qsEAAAOSSURBVHgB7drVYuNKEEXR03YMJ0aBQXHAYWbm/P9PXZyZBimOHiTVQK9H4zZDFTzP8zzP8zzP83JQtfpSo4mfRqvNfy138HPo9vhNf4CfQYPaMFAQF9IUdSAtpm3UhSza5O+kmBb5O6nPtGgMOQNmmEwhp84MSQ0VUCuz1bGCQ62tM8MGSlebk+RwE67WVlbSNkq2xf8lO0jZbWQk7SmUaZvfxS3kS6pX00NuIct+SNdBNT08RLajmLakU0kP1/GJ40Pa5idV9JD4jBrR1u5W0UN8rkHbaRU9xAIbtM0q6CEWqSU0rZ+V30MstGMXnZffQyx2Qcu49B7iC5c09UvvIb7QbdN0UHYP8ZWrdRrmuyX3EIbDa2TYoalRcg9hIM/PkLZMw40qt8cJYtREynFCw6DcHjeIcfDF+W/L7UkFkRtw7c5pOCm1xw3KLprRcIfc1MFyxMXyBHEGx/06tfk9cmr1SRYRlFzDMaJhBzmFLCiIURe2BxrqyGfGwoK4B8chtTbyWS4wiI+wBTTsIpf1IoNC2O5jagPkwiKDOFjwBN2SCAphe6J2KBHEE1im1JJ7iaAGLLs0jCWChrA9UwskgngGy4jakUjQCiwNag2RoCdYZtTqIkGXsLxQ2xMJCmHpUAtFgtqwNKk9iwRFsJxQi0SCbmDZt46SCBrC8uA+mv5JfQpLjdqrSNAWLAfUzkWCBj/bR8c+LNvUNiSCItgOpb9+bMHSTah1JIIeYOnQsCsQ1IftgtozBIIC2G6pbQsEPStY1IRaDbm8FRm0AtsODS3k8lRg0C0WPGJvyGc3KizovQXbCQ1LyOn4uaigKRx3NATIS631JkUEPcGh3qlNulX/6bkNV42GUdV/C6d77iMaHqr94zy5+GJodljtaGG+iZT9mIaXSocvp/tIe6Vhfl/heGq4iQwdmraqHOApZGjd0DDZlx5xqpCmNfEh8IimNyU9Jg9omUovEjzGNJ1Kr1o8TmiKT4SXUXYSWi6E13UCp6enRBeasErbTUt05evskrZJE6igqI9sK3M6akAVRSNk6S7R1QCqKEqukKaCiK5ToJKig6ycN6aEXZRrFpPkzQ5c90dvTLtUKFv3pXExvYfrJWKGbQUh28yy9nOtwCcHENNj2voAciZM+diHILrWA4gSv3tc7/J3j61u5jTOIG5/zm/eN+7xM7i+4b/eAoWfRHf1I1wawPM8z/M8z/M872/KUtAsVj+VvQAAAABJRU5ErkJggg=="));
            }
        }
    }

    public final void k() {
        int width = getWidth();
        int height = getHeight();
        if (width == 0 || height == 0 || !this.B || this.f94785z == 0 || this.A == 0) {
            return;
        }
        this.B = false;
        ViewGroup.LayoutParams layoutParams = this.f94771l.getLayoutParams();
        int i10 = this.f94785z;
        int i11 = this.A;
        if (i10 > i11) {
            layoutParams.width = width;
            layoutParams.height = (width * i11) / i10;
        } else {
            layoutParams.width = (i10 * height) / i11;
            layoutParams.height = height;
        }
        this.f94771l.setLayoutParams(layoutParams);
    }

    public final void l(int i10) {
        this.C = i10;
        int iC = b3.h.c(i10);
        if (iC == 0) {
            ImageView imageView = this.f94766g;
            if (imageView != null) {
                imageView.setVisibility(0);
                this.f94766g.bringToFront();
            }
            if (this.f94780u) {
                this.f94771l.setVisibility(4);
                this.f94767h.setVisibility(4);
                this.f94768i.setVisibility(4);
                this.f94769j.setVisibility(4);
                return;
            }
            return;
        }
        if (iC == 1) {
            ImageView imageView2 = this.f94766g;
            if (imageView2 != null) {
                imageView2.setVisibility(4);
            }
            if (this.f94780u) {
                this.f94771l.setVisibility(0);
                this.f94771l.bringToFront();
                this.f94769j.setVisibility(0);
                this.f94769j.bringToFront();
                j();
                this.f94767h.setVisibility(4);
                this.f94768i.setVisibility(4);
                return;
            }
            return;
        }
        if (iC == 2) {
            ImageView imageView3 = this.f94766g;
            if (imageView3 != null) {
                imageView3.setVisibility(0);
                this.f94766g.bringToFront();
            }
            if (this.f94780u) {
                this.f94767h.setVisibility(0);
                this.f94767h.bringToFront();
                this.f94771l.setVisibility(4);
                this.f94768i.setVisibility(4);
                this.f94769j.setVisibility(4);
                return;
            }
            return;
        }
        if (iC != 3) {
            return;
        }
        ImageView imageView4 = this.f94766g;
        if (imageView4 != null) {
            imageView4.setVisibility(0);
            this.f94766g.bringToFront();
        }
        if (this.f94780u) {
            this.f94768i.setVisibility(0);
            this.f94768i.bringToFront();
            this.f94771l.setVisibility(4);
            this.f94767h.setVisibility(4);
            this.f94769j.setVisibility(4);
        }
    }

    public final void m() throws IllegalStateException {
        if (!this.f94774o) {
            h(io.bidmachine.iab.vast.a.f60395h);
            this.f94774o = true;
            nm.a.d("MediaView: video finished");
        }
        stopVideoVisibilityCheckerTimer();
        f();
        if (d()) {
            this.f94770k.seekTo(0);
        }
        this.f94782w = true;
    }

    @Override // android.media.MediaPlayer.OnCompletionListener
    public void onCompletion(MediaPlayer mediaPlayer) throws IllegalStateException {
        m();
    }

    @Override // android.media.MediaPlayer.OnErrorListener
    public boolean onError(MediaPlayer mediaPlayer, int i10, int i11) {
        nm.a.d("MediaView: onError");
        b();
        return true;
    }

    @Override // android.widget.RelativeLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        k();
    }

    @Override // android.widget.RelativeLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        int mode = View.MeasureSpec.getMode(i10);
        int mode2 = View.MeasureSpec.getMode(i11);
        int size = View.MeasureSpec.getSize(i10);
        int size2 = View.MeasureSpec.getSize(i11);
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        if (mode != 1073741824) {
            size = mode == Integer.MIN_VALUE ? Math.min(size, measuredWidth) : measuredWidth;
        }
        int i12 = (int) (size * 0.5625f);
        if (mode2 != 1073741824 || size2 >= i12) {
            size2 = i12;
        } else {
            size = (int) (size2 * 1.7777778f);
        }
        if (Math.abs(size2 - measuredHeight) >= 2 || Math.abs(size - measuredWidth) >= 2) {
            getLayoutParams().width = size;
            getLayoutParams().height = size2;
        }
        super.onMeasure(i10, i11);
    }

    @Override // android.media.MediaPlayer.OnPreparedListener
    public void onPrepared(MediaPlayer mediaPlayer) throws IllegalStateException {
        nm.a.d("MediaView: onPrepared");
        this.f94776q = true;
        if (this.f94779t) {
            i();
        } else {
            l(4);
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i10, int i11) {
        try {
            if (this.f94770k == null) {
                c();
            }
            this.f94770k.setSurface(new Surface(surfaceTexture));
            g();
        } catch (Exception e10) {
            nm.a.w(e10);
            l(1);
            this.f94780u = false;
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        return false;
    }

    @Override // android.media.MediaPlayer.OnVideoSizeChangedListener
    public void onVideoSizeChanged(MediaPlayer mediaPlayer, int i10, int i11) {
        this.f94785z = i10;
        this.A = i11;
        this.B = true;
        k();
    }

    public void onViewAppearOnScreen() throws IllegalStateException {
        nm.a.d("MediaView: onViewAppearOnScreen");
        this.f94778s = true;
        if (this.f94779t) {
            i();
        } else if (this.C != 3) {
            l(4);
        }
    }

    @Override // android.view.View
    public final void onWindowVisibilityChanged(int i10) throws IllegalStateException {
        if (i10 != 0) {
            f();
        } else if (this.f94779t) {
            i();
        }
        super.onWindowVisibilityChanged(i10);
    }

    public void release() {
        new Thread(new e(this)).start();
    }

    public void setNativeAdObject(vp.l lVar) {
        applyNative(lVar, lVar, lVar);
    }

    public void startVideoVisibilityCheckerTimer() {
        if (this.f94780u) {
            Timer timer = new Timer();
            this.f94772m = timer;
            timer.schedule(new j(this), 0L, 500);
        }
    }

    public void stopVideoVisibilityCheckerTimer() {
        Timer timer = this.f94772m;
        if (timer != null) {
            timer.cancel();
            this.f94772m = null;
        }
    }

    @Override // yp.q
    public void videoPlayerActivityClosed(int i10, boolean z10) throws IllegalStateException {
        nm.a.d(new o0(i10, z10, 2));
        try {
            if (z10) {
                m();
            } else if (d()) {
                this.f94770k.seekTo(i10);
            }
        } catch (Exception e10) {
            nm.a.w(e10);
        }
        D = null;
    }

    public k(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f94765f = false;
        this.f94775p = true;
        this.f94785z = 0;
        this.A = 0;
        this.B = true;
        this.C = 1;
    }

    public k(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f94765f = false;
        this.f94775p = true;
        this.f94785z = 0;
        this.A = 0;
        this.B = true;
        this.C = 1;
    }

    public k(Context context, AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10, i11);
        this.f94765f = false;
        this.f94775p = true;
        this.f94785z = 0;
        this.A = 0;
        this.B = true;
        this.C = 1;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i10, int i11) {
    }
}
