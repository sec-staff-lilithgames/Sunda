package io.odeeo.internal.s0;

import android.content.Context;
import android.graphics.PointF;
import android.graphics.SurfaceTexture;
import android.hardware.Sensor;
import android.hardware.SensorManager;
import android.opengl.GLES20;
import android.opengl.GLSurfaceView;
import android.opengl.Matrix;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.Surface;
import android.view.WindowManager;
import io.odeeo.internal.q0.g0;
import io.odeeo.internal.s0.d;
import io.odeeo.internal.s0.j;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class i extends GLSurfaceView {

    /* renamed from: a, reason: collision with root package name */
    public final CopyOnWriteArrayList<b> f66318a;

    /* renamed from: b, reason: collision with root package name */
    public final SensorManager f66319b;

    /* renamed from: c, reason: collision with root package name */
    public final Sensor f66320c;

    /* renamed from: d, reason: collision with root package name */
    public final d f66321d;

    /* renamed from: e, reason: collision with root package name */
    public final Handler f66322e;

    /* renamed from: f, reason: collision with root package name */
    public final j f66323f;

    /* renamed from: g, reason: collision with root package name */
    public final h f66324g;

    /* renamed from: h, reason: collision with root package name */
    public SurfaceTexture f66325h;

    /* renamed from: i, reason: collision with root package name */
    public Surface f66326i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f66327j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f66328k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f66329l;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public interface b {
        void onVideoSurfaceCreated(Surface surface);

        void onVideoSurfaceDestroyed(Surface surface);
    }

    public i(Context context) {
        this(context, null);
    }

    public void addVideoSurfaceListener(b bVar) {
        this.f66318a.add(bVar);
    }

    public io.odeeo.internal.s0.a getCameraMotionListener() {
        return this.f66324g;
    }

    public io.odeeo.internal.r0.j getVideoFrameMetadataListener() {
        return this.f66324g;
    }

    public Surface getVideoSurface() {
        return this.f66326i;
    }

    @Override // android.opengl.GLSurfaceView, android.view.SurfaceView, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f66322e.post(new com.unity3d.services.banners.view.a(this, 16));
    }

    @Override // android.opengl.GLSurfaceView
    public void onPause() {
        this.f66328k = false;
        b();
        super.onPause();
    }

    @Override // android.opengl.GLSurfaceView
    public void onResume() {
        super.onResume();
        this.f66328k = true;
        b();
    }

    public void removeVideoSurfaceListener(b bVar) {
        this.f66318a.remove(bVar);
    }

    public void setDefaultStereoMode(int i10) {
        this.f66324g.setDefaultStereoMode(i10);
    }

    public void setUseSensorRotation(boolean z10) {
        this.f66327j = z10;
        b();
    }

    public i(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f66318a = new CopyOnWriteArrayList<>();
        this.f66322e = new Handler(Looper.getMainLooper());
        SensorManager sensorManager = (SensorManager) io.odeeo.internal.q0.a.checkNotNull(context.getSystemService("sensor"));
        this.f66319b = sensorManager;
        Sensor defaultSensor = g0.f65861a >= 18 ? sensorManager.getDefaultSensor(15) : null;
        this.f66320c = defaultSensor == null ? sensorManager.getDefaultSensor(11) : defaultSensor;
        h hVar = new h();
        this.f66324g = hVar;
        a aVar = new a(hVar);
        j jVar = new j(context, aVar, 25.0f);
        this.f66323f = jVar;
        this.f66321d = new d(((WindowManager) io.odeeo.internal.q0.a.checkNotNull((WindowManager) context.getSystemService("window"))).getDefaultDisplay(), jVar, aVar);
        this.f66327j = true;
        setEGLContextClientVersion(2);
        setRenderer(aVar);
        setOnTouchListener(jVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a() {
        Surface surface = this.f66326i;
        if (surface != null) {
            Iterator<b> it = this.f66318a.iterator();
            while (it.hasNext()) {
                it.next().onVideoSurfaceDestroyed(surface);
            }
        }
        a(this.f66325h, surface);
        this.f66325h = null;
        this.f66326i = null;
    }

    public final void b() {
        boolean z10 = this.f66327j && this.f66328k;
        Sensor sensor = this.f66320c;
        if (sensor == null || z10 == this.f66329l) {
            return;
        }
        if (z10) {
            this.f66319b.registerListener(this.f66321d, sensor, 0);
        } else {
            this.f66319b.unregisterListener(this.f66321d);
        }
        this.f66329l = z10;
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public final class a implements GLSurfaceView.Renderer, j.a, d.a {

        /* renamed from: a, reason: collision with root package name */
        public final h f66330a;

        /* renamed from: d, reason: collision with root package name */
        public final float[] f66333d;

        /* renamed from: e, reason: collision with root package name */
        public final float[] f66334e;

        /* renamed from: f, reason: collision with root package name */
        public final float[] f66335f;

        /* renamed from: g, reason: collision with root package name */
        public float f66336g;

        /* renamed from: h, reason: collision with root package name */
        public float f66337h;

        /* renamed from: b, reason: collision with root package name */
        public final float[] f66331b = new float[16];

        /* renamed from: c, reason: collision with root package name */
        public final float[] f66332c = new float[16];

        /* renamed from: i, reason: collision with root package name */
        public final float[] f66338i = new float[16];

        /* renamed from: j, reason: collision with root package name */
        public final float[] f66339j = new float[16];

        public a(h hVar) {
            float[] fArr = new float[16];
            this.f66333d = fArr;
            float[] fArr2 = new float[16];
            this.f66334e = fArr2;
            float[] fArr3 = new float[16];
            this.f66335f = fArr3;
            this.f66330a = hVar;
            Matrix.setIdentityM(fArr, 0);
            Matrix.setIdentityM(fArr2, 0);
            Matrix.setIdentityM(fArr3, 0);
            this.f66337h = 3.1415927f;
        }

        public final void a() {
            Matrix.setRotateM(this.f66334e, 0, -this.f66336g, (float) Math.cos(this.f66337h), (float) Math.sin(this.f66337h), 0.0f);
        }

        @Override // android.opengl.GLSurfaceView.Renderer
        public void onDrawFrame(GL10 gl10) {
            synchronized (this) {
                Matrix.multiplyMM(this.f66339j, 0, this.f66333d, 0, this.f66335f, 0);
                Matrix.multiplyMM(this.f66338i, 0, this.f66334e, 0, this.f66339j, 0);
            }
            Matrix.multiplyMM(this.f66332c, 0, this.f66331b, 0, this.f66338i, 0);
            this.f66330a.drawFrame(this.f66332c, false);
        }

        @Override // io.odeeo.internal.s0.d.a
        public synchronized void onOrientationChange(float[] fArr, float f10) {
            float[] fArr2 = this.f66333d;
            System.arraycopy(fArr, 0, fArr2, 0, fArr2.length);
            this.f66337h = -f10;
            a();
        }

        @Override // io.odeeo.internal.s0.j.a
        public synchronized void onScrollChange(PointF pointF) {
            this.f66336g = pointF.y;
            a();
            Matrix.setRotateM(this.f66335f, 0, -pointF.x, 0.0f, 1.0f, 0.0f);
        }

        @Override // io.odeeo.internal.s0.j.a
        public boolean onSingleTapUp(MotionEvent motionEvent) {
            return i.this.performClick();
        }

        @Override // android.opengl.GLSurfaceView.Renderer
        public void onSurfaceChanged(GL10 gl10, int i10, int i11) {
            GLES20.glViewport(0, 0, i10, i11);
            float f10 = i10 / i11;
            Matrix.perspectiveM(this.f66331b, 0, a(f10), f10, 0.1f, 100.0f);
        }

        @Override // android.opengl.GLSurfaceView.Renderer
        public synchronized void onSurfaceCreated(GL10 gl10, EGLConfig eGLConfig) {
            i.this.b(this.f66330a.init());
        }

        public final float a(float f10) {
            if (f10 > 1.0f) {
                return (float) (Math.toDegrees(Math.atan(Math.tan(Math.toRadians(45.0d)) / f10)) * 2.0d);
            }
            return 90.0f;
        }
    }

    public final void b(SurfaceTexture surfaceTexture) {
        this.f66322e.post(new com.ironsource.environment.thread.a(28, this, surfaceTexture));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(SurfaceTexture surfaceTexture) {
        SurfaceTexture surfaceTexture2 = this.f66325h;
        Surface surface = this.f66326i;
        Surface surface2 = new Surface(surfaceTexture);
        this.f66325h = surfaceTexture;
        this.f66326i = surface2;
        Iterator<b> it = this.f66318a.iterator();
        while (it.hasNext()) {
            it.next().onVideoSurfaceCreated(surface2);
        }
        a(surfaceTexture2, surface);
    }

    public static void a(SurfaceTexture surfaceTexture, Surface surface) {
        if (surfaceTexture != null) {
            surfaceTexture.release();
        }
        if (surface != null) {
            surface.release();
        }
    }
}
