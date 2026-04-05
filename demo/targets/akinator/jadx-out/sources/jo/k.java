package jo;

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
import io.bidmachine.media3.common.util.t;
import io.v;
import java.util.concurrent.CopyOnWriteArrayList;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class k extends GLSurfaceView {

    /* renamed from: n, reason: collision with root package name */
    public static final /* synthetic */ int f69867n = 0;

    /* renamed from: b, reason: collision with root package name */
    public final CopyOnWriteArrayList f69868b;

    /* renamed from: c, reason: collision with root package name */
    public final SensorManager f69869c;

    /* renamed from: e, reason: collision with root package name */
    public final Sensor f69870e;

    /* renamed from: f, reason: collision with root package name */
    public final e f69871f;

    /* renamed from: g, reason: collision with root package name */
    public final Handler f69872g;

    /* renamed from: h, reason: collision with root package name */
    public final j f69873h;

    /* renamed from: i, reason: collision with root package name */
    public SurfaceTexture f69874i;

    /* renamed from: j, reason: collision with root package name */
    public Surface f69875j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f69876k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f69877l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f69878m;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public final class a implements GLSurfaceView.Renderer, m, d {

        /* renamed from: b, reason: collision with root package name */
        public final j f69879b;

        /* renamed from: f, reason: collision with root package name */
        public final float[] f69882f;

        /* renamed from: g, reason: collision with root package name */
        public final float[] f69883g;

        /* renamed from: h, reason: collision with root package name */
        public final float[] f69884h;

        /* renamed from: i, reason: collision with root package name */
        public float f69885i;

        /* renamed from: j, reason: collision with root package name */
        public float f69886j;

        /* renamed from: c, reason: collision with root package name */
        public final float[] f69880c = new float[16];

        /* renamed from: e, reason: collision with root package name */
        public final float[] f69881e = new float[16];

        /* renamed from: k, reason: collision with root package name */
        public final float[] f69887k = new float[16];

        /* renamed from: l, reason: collision with root package name */
        public final float[] f69888l = new float[16];

        public a(j jVar) {
            float[] fArr = new float[16];
            this.f69882f = fArr;
            float[] fArr2 = new float[16];
            this.f69883g = fArr2;
            float[] fArr3 = new float[16];
            this.f69884h = fArr3;
            this.f69879b = jVar;
            t.setToIdentity(fArr);
            t.setToIdentity(fArr2);
            t.setToIdentity(fArr3);
            this.f69886j = 3.1415927f;
        }

        @Override // android.opengl.GLSurfaceView.Renderer
        public void onDrawFrame(GL10 gl10) {
            synchronized (this) {
                Matrix.multiplyMM(this.f69888l, 0, this.f69882f, 0, this.f69884h, 0);
                Matrix.multiplyMM(this.f69887k, 0, this.f69883g, 0, this.f69888l, 0);
            }
            Matrix.multiplyMM(this.f69881e, 0, this.f69880c, 0, this.f69887k, 0);
            this.f69879b.drawFrame(this.f69881e, false);
        }

        @Override // jo.d
        public synchronized void onOrientationChange(float[] fArr, float f10) {
            float[] fArr2 = this.f69882f;
            System.arraycopy(fArr, 0, fArr2, 0, fArr2.length);
            float f11 = -f10;
            this.f69886j = f11;
            Matrix.setRotateM(this.f69883g, 0, -this.f69885i, (float) Math.cos(f11), (float) Math.sin(this.f69886j), 0.0f);
        }

        @Override // jo.m
        public synchronized void onScrollChange(PointF pointF) {
            float f10 = pointF.y;
            this.f69885i = f10;
            Matrix.setRotateM(this.f69883g, 0, -f10, (float) Math.cos(this.f69886j), (float) Math.sin(this.f69886j), 0.0f);
            Matrix.setRotateM(this.f69884h, 0, -pointF.x, 0.0f, 1.0f, 0.0f);
        }

        @Override // jo.m
        public boolean onSingleTapUp(MotionEvent motionEvent) {
            return k.this.performClick();
        }

        @Override // android.opengl.GLSurfaceView.Renderer
        public void onSurfaceChanged(GL10 gl10, int i10, int i11) {
            GLES20.glViewport(0, 0, i10, i11);
            float f10 = i10 / i11;
            Matrix.perspectiveM(this.f69880c, 0, f10 > 1.0f ? (float) (Math.toDegrees(Math.atan(Math.tan(Math.toRadians(45.0d)) / f10)) * 2.0d) : 90.0f, f10, 0.1f, 100.0f);
        }

        @Override // android.opengl.GLSurfaceView.Renderer
        public synchronized void onSurfaceCreated(GL10 gl10, EGLConfig eGLConfig) {
            k kVar = k.this;
            kVar.f69872g.post(new im.k(18, kVar, this.f69879b.init()));
        }
    }

    public k(Context context) {
        this(context, null);
    }

    public final void a() {
        boolean z10 = this.f69876k && this.f69877l;
        Sensor sensor = this.f69870e;
        if (sensor == null || z10 == this.f69878m) {
            return;
        }
        e eVar = this.f69871f;
        SensorManager sensorManager = this.f69869c;
        if (z10) {
            sensorManager.registerListener(eVar, sensor, 0);
        } else {
            sensorManager.unregisterListener(eVar);
        }
        this.f69878m = z10;
    }

    public void addVideoSurfaceListener(l lVar) {
        this.f69868b.add(lVar);
    }

    public jo.a getCameraMotionListener() {
        return this.f69873h;
    }

    public v getVideoFrameMetadataListener() {
        return this.f69873h;
    }

    public Surface getVideoSurface() {
        return this.f69875j;
    }

    @Override // android.opengl.GLSurfaceView, android.view.SurfaceView, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f69872g.post(new ji.t(this, 1));
    }

    @Override // android.opengl.GLSurfaceView
    public void onPause() {
        this.f69877l = false;
        a();
        super.onPause();
    }

    @Override // android.opengl.GLSurfaceView
    public void onResume() {
        super.onResume();
        this.f69877l = true;
        a();
    }

    public void removeVideoSurfaceListener(l lVar) {
        this.f69868b.remove(lVar);
    }

    public void setDefaultStereoMode(int i10) {
        this.f69873h.setDefaultStereoMode(i10);
    }

    public void setUseSensorRotation(boolean z10) {
        this.f69876k = z10;
        a();
    }

    public k(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f69868b = new CopyOnWriteArrayList();
        this.f69872g = new Handler(Looper.getMainLooper());
        SensorManager sensorManager = (SensorManager) io.bidmachine.media3.common.util.a.checkNotNull(context.getSystemService("sensor"));
        this.f69869c = sensorManager;
        Sensor defaultSensor = sensorManager.getDefaultSensor(15);
        this.f69870e = defaultSensor == null ? sensorManager.getDefaultSensor(11) : defaultSensor;
        j jVar = new j();
        this.f69873h = jVar;
        a aVar = new a(jVar);
        View.OnTouchListener nVar = new n(context, aVar, 25.0f);
        this.f69871f = new e(((WindowManager) io.bidmachine.media3.common.util.a.checkNotNull((WindowManager) context.getSystemService("window"))).getDefaultDisplay(), nVar, aVar);
        this.f69876k = true;
        setEGLContextClientVersion(2);
        setRenderer(aVar);
        setOnTouchListener(nVar);
    }
}
