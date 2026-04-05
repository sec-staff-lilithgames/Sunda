package tf;

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
import android.view.View;
import android.view.WindowManager;
import com.google.android.exoplayer2.util.n1;
import com.google.android.exoplayer2.util.x;
import java.util.concurrent.CopyOnWriteArrayList;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;
import on.w;
import on.z;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class k extends GLSurfaceView {

    /* renamed from: n, reason: collision with root package name */
    public static final /* synthetic */ int f86887n = 0;

    /* renamed from: b, reason: collision with root package name */
    public final CopyOnWriteArrayList f86888b;

    /* renamed from: c, reason: collision with root package name */
    public final SensorManager f86889c;

    /* renamed from: e, reason: collision with root package name */
    public final Sensor f86890e;

    /* renamed from: f, reason: collision with root package name */
    public final e f86891f;

    /* renamed from: g, reason: collision with root package name */
    public final Handler f86892g;

    /* renamed from: h, reason: collision with root package name */
    public final j f86893h;

    /* renamed from: i, reason: collision with root package name */
    public SurfaceTexture f86894i;

    /* renamed from: j, reason: collision with root package name */
    public Surface f86895j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f86896k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f86897l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f86898m;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public final class a implements GLSurfaceView.Renderer, m, d {

        /* renamed from: b, reason: collision with root package name */
        public final j f86899b;

        /* renamed from: f, reason: collision with root package name */
        public final float[] f86902f;

        /* renamed from: g, reason: collision with root package name */
        public final float[] f86903g;

        /* renamed from: h, reason: collision with root package name */
        public final float[] f86904h;

        /* renamed from: i, reason: collision with root package name */
        public float f86905i;

        /* renamed from: j, reason: collision with root package name */
        public float f86906j;

        /* renamed from: c, reason: collision with root package name */
        public final float[] f86900c = new float[16];

        /* renamed from: e, reason: collision with root package name */
        public final float[] f86901e = new float[16];

        /* renamed from: k, reason: collision with root package name */
        public final float[] f86907k = new float[16];

        /* renamed from: l, reason: collision with root package name */
        public final float[] f86908l = new float[16];

        public a(j jVar) {
            float[] fArr = new float[16];
            this.f86902f = fArr;
            float[] fArr2 = new float[16];
            this.f86903g = fArr2;
            float[] fArr3 = new float[16];
            this.f86904h = fArr3;
            this.f86899b = jVar;
            x.setToIdentity(fArr);
            x.setToIdentity(fArr2);
            x.setToIdentity(fArr3);
            this.f86906j = 3.1415927f;
        }

        @Override // android.opengl.GLSurfaceView.Renderer
        public void onDrawFrame(GL10 gl10) {
            synchronized (this) {
                Matrix.multiplyMM(this.f86908l, 0, this.f86902f, 0, this.f86904h, 0);
                Matrix.multiplyMM(this.f86907k, 0, this.f86903g, 0, this.f86908l, 0);
            }
            Matrix.multiplyMM(this.f86901e, 0, this.f86900c, 0, this.f86907k, 0);
            this.f86899b.drawFrame(this.f86901e, false);
        }

        @Override // tf.d
        public synchronized void onOrientationChange(float[] fArr, float f10) {
            float[] fArr2 = this.f86902f;
            System.arraycopy(fArr, 0, fArr2, 0, fArr2.length);
            float f11 = -f10;
            this.f86906j = f11;
            Matrix.setRotateM(this.f86903g, 0, -this.f86905i, (float) Math.cos(f11), (float) Math.sin(this.f86906j), 0.0f);
        }

        @Override // tf.m
        public synchronized void onScrollChange(PointF pointF) {
            float f10 = pointF.y;
            this.f86905i = f10;
            Matrix.setRotateM(this.f86903g, 0, -f10, (float) Math.cos(this.f86906j), (float) Math.sin(this.f86906j), 0.0f);
            Matrix.setRotateM(this.f86904h, 0, -pointF.x, 0.0f, 1.0f, 0.0f);
        }

        @Override // tf.m
        public boolean onSingleTapUp(MotionEvent motionEvent) {
            return k.this.performClick();
        }

        @Override // android.opengl.GLSurfaceView.Renderer
        public void onSurfaceChanged(GL10 gl10, int i10, int i11) {
            GLES20.glViewport(0, 0, i10, i11);
            float f10 = i10 / i11;
            Matrix.perspectiveM(this.f86900c, 0, f10 > 1.0f ? (float) (Math.toDegrees(Math.atan(Math.tan(Math.toRadians(45.0d)) / f10)) * 2.0d) : 90.0f, f10, 0.1f, 100.0f);
        }

        @Override // android.opengl.GLSurfaceView.Renderer
        public synchronized void onSurfaceCreated(GL10 gl10, EGLConfig eGLConfig) {
            k kVar = k.this;
            kVar.f86892g.post(new z(14, kVar, this.f86899b.init()));
        }
    }

    public k(Context context) {
        this(context, null);
    }

    public final void a() {
        boolean z10 = this.f86896k && this.f86897l;
        Sensor sensor = this.f86890e;
        if (sensor == null || z10 == this.f86898m) {
            return;
        }
        e eVar = this.f86891f;
        SensorManager sensorManager = this.f86889c;
        if (z10) {
            sensorManager.registerListener(eVar, sensor, 0);
        } else {
            sensorManager.unregisterListener(eVar);
        }
        this.f86898m = z10;
    }

    public void addVideoSurfaceListener(l lVar) {
        this.f86888b.add(lVar);
    }

    public tf.a getCameraMotionListener() {
        return this.f86893h;
    }

    public sf.l getVideoFrameMetadataListener() {
        return this.f86893h;
    }

    public Surface getVideoSurface() {
        return this.f86895j;
    }

    @Override // android.opengl.GLSurfaceView, android.view.SurfaceView, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f86892g.post(new w(this, 13));
    }

    @Override // android.opengl.GLSurfaceView
    public void onPause() {
        this.f86897l = false;
        a();
        super.onPause();
    }

    @Override // android.opengl.GLSurfaceView
    public void onResume() {
        super.onResume();
        this.f86897l = true;
        a();
    }

    public void removeVideoSurfaceListener(l lVar) {
        this.f86888b.remove(lVar);
    }

    public void setDefaultStereoMode(int i10) {
        this.f86893h.setDefaultStereoMode(i10);
    }

    public void setUseSensorRotation(boolean z10) {
        this.f86896k = z10;
        a();
    }

    public k(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f86888b = new CopyOnWriteArrayList();
        this.f86892g = new Handler(Looper.getMainLooper());
        SensorManager sensorManager = (SensorManager) com.google.android.exoplayer2.util.a.checkNotNull(context.getSystemService("sensor"));
        this.f86889c = sensorManager;
        Sensor defaultSensor = n1.f28506a >= 18 ? sensorManager.getDefaultSensor(15) : null;
        this.f86890e = defaultSensor == null ? sensorManager.getDefaultSensor(11) : defaultSensor;
        j jVar = new j();
        this.f86893h = jVar;
        a aVar = new a(jVar);
        View.OnTouchListener nVar = new n(context, aVar, 25.0f);
        this.f86891f = new e(((WindowManager) com.google.android.exoplayer2.util.a.checkNotNull((WindowManager) context.getSystemService("window"))).getDefaultDisplay(), nVar, aVar);
        this.f86896k = true;
        setEGLContextClientVersion(2);
        setRenderer(aVar);
        setOnTouchListener(nVar);
    }
}
