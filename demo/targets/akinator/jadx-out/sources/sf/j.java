package sf;

import android.content.Context;
import android.opengl.GLES20;
import android.opengl.GLSurfaceView;
import android.util.AttributeSet;
import android.util.Log;
import com.bytedance.sdk.openadsdk.multipro.xsB.LJjmO;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.FloatBuffer;
import java.util.concurrent.atomic.AtomicReference;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class j extends GLSurfaceView implements k {

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f85683c = 0;

    /* renamed from: b, reason: collision with root package name */
    public final a f85684b;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a implements GLSurfaceView.Renderer {

        /* renamed from: m, reason: collision with root package name */
        public static final float[] f85685m = {1.164f, 1.164f, 1.164f, 0.0f, -0.392f, 2.017f, 1.596f, -0.813f, 0.0f};

        /* renamed from: n, reason: collision with root package name */
        public static final float[] f85686n = {1.164f, 1.164f, 1.164f, 0.0f, -0.213f, 2.112f, 1.793f, -0.533f, 0.0f};

        /* renamed from: o, reason: collision with root package name */
        public static final float[] f85687o = {1.168f, 1.168f, 1.168f, 0.0f, -0.188f, 2.148f, 1.683f, -0.652f, 0.0f};

        /* renamed from: p, reason: collision with root package name */
        public static final String[] f85688p = {"y_tex", "u_tex", "v_tex"};

        /* renamed from: q, reason: collision with root package name */
        public static final FloatBuffer f85689q = com.google.android.exoplayer2.util.x.createBuffer(new float[]{-1.0f, 1.0f, -1.0f, -1.0f, 1.0f, 1.0f, 1.0f, -1.0f});

        /* renamed from: b, reason: collision with root package name */
        public final GLSurfaceView f85690b;

        /* renamed from: c, reason: collision with root package name */
        public final int[] f85691c = new int[3];

        /* renamed from: e, reason: collision with root package name */
        public final int[] f85692e = new int[3];

        /* renamed from: f, reason: collision with root package name */
        public final int[] f85693f = new int[3];

        /* renamed from: g, reason: collision with root package name */
        public final int[] f85694g = new int[3];

        /* renamed from: h, reason: collision with root package name */
        public final AtomicReference f85695h = new AtomicReference();

        /* renamed from: i, reason: collision with root package name */
        public final FloatBuffer[] f85696i = new FloatBuffer[3];

        /* renamed from: j, reason: collision with root package name */
        public com.google.android.exoplayer2.util.u f85697j;

        /* renamed from: k, reason: collision with root package name */
        public int f85698k;

        /* renamed from: l, reason: collision with root package name */
        public ce.n f85699l;

        public a(GLSurfaceView gLSurfaceView) {
            this.f85690b = gLSurfaceView;
            for (int i10 = 0; i10 < 3; i10++) {
                int[] iArr = this.f85693f;
                this.f85694g[i10] = -1;
                iArr[i10] = -1;
            }
        }

        @Override // android.opengl.GLSurfaceView.Renderer
        public void onDrawFrame(GL10 gl10) {
            ce.n nVar = (ce.n) this.f85695h.getAndSet(null);
            if (nVar == null && this.f85699l == null) {
                return;
            }
            if (nVar != null) {
                ce.n nVar2 = this.f85699l;
                if (nVar2 != null) {
                    nVar2.release();
                }
                this.f85699l = nVar;
            }
            ce.n nVar3 = (ce.n) com.google.android.exoplayer2.util.a.checkNotNull(this.f85699l);
            int i10 = nVar3.f12267j;
            GLES20.glUniformMatrix3fv(this.f85698k, 1, false, i10 != 1 ? i10 != 3 ? f85686n : f85687o : f85685m, 0);
            int[] iArr = (int[]) com.google.android.exoplayer2.util.a.checkNotNull(nVar3.f12266i);
            ByteBuffer[] byteBufferArr = (ByteBuffer[]) com.google.android.exoplayer2.util.a.checkNotNull(nVar3.f12265h);
            int i11 = 0;
            while (i11 < 3) {
                int i12 = i11 == 0 ? nVar3.f12264g : (nVar3.f12264g + 1) / 2;
                GLES20.glActiveTexture(33984 + i11);
                GLES20.glBindTexture(3553, this.f85691c[i11]);
                GLES20.glPixelStorei(3317, 1);
                GLES20.glTexImage2D(3553, 0, 6409, iArr[i11], i12, 0, 6409, 5121, byteBufferArr[i11]);
                i11++;
            }
            int i13 = nVar3.f12263f;
            int i14 = (i13 + 1) / 2;
            int[] iArr2 = {i13, i14, i14};
            for (int i15 = 0; i15 < 3; i15++) {
                int[] iArr3 = this.f85693f;
                int i16 = iArr3[i15];
                int i17 = iArr2[i15];
                int[] iArr4 = this.f85694g;
                if (i16 != i17 || iArr4[i15] != iArr[i15]) {
                    com.google.android.exoplayer2.util.a.checkState(iArr[i15] != 0);
                    float f10 = iArr2[i15] / iArr[i15];
                    FloatBuffer floatBufferCreateBuffer = com.google.android.exoplayer2.util.x.createBuffer(new float[]{0.0f, 0.0f, 0.0f, 1.0f, f10, 0.0f, f10, 1.0f});
                    FloatBuffer[] floatBufferArr = this.f85696i;
                    floatBufferArr[i15] = floatBufferCreateBuffer;
                    GLES20.glVertexAttribPointer(this.f85692e[i15], 2, 5126, false, 0, (Buffer) floatBufferArr[i15]);
                    iArr3[i15] = iArr2[i15];
                    iArr4[i15] = iArr[i15];
                }
            }
            GLES20.glClear(16384);
            GLES20.glDrawArrays(5, 0, 4);
            try {
                com.google.android.exoplayer2.util.x.checkGlError();
            } catch (com.google.android.exoplayer2.util.w e10) {
                Log.e("VideoDecoderGLSV", "Failed to draw a frame", e10);
            }
        }

        @Override // android.opengl.GLSurfaceView.Renderer
        public void onSurfaceChanged(GL10 gl10, int i10, int i11) {
            GLES20.glViewport(0, 0, i10, i11);
        }

        public void setOutputBuffer(ce.n nVar) {
            ce.n nVar2 = (ce.n) this.f85695h.getAndSet(nVar);
            if (nVar2 != null) {
                nVar2.release();
            }
            this.f85690b.requestRender();
        }

        @Override // android.opengl.GLSurfaceView.Renderer
        public void onSurfaceCreated(GL10 gl10, EGLConfig eGLConfig) {
            int[] iArr = this.f85692e;
            try {
                com.google.android.exoplayer2.util.u uVar = new com.google.android.exoplayer2.util.u("varying vec2 interp_tc_y;\nvarying vec2 interp_tc_u;\nvarying vec2 interp_tc_v;\nattribute vec4 in_pos;\nattribute vec2 in_tc_y;\nattribute vec2 in_tc_u;\nattribute vec2 in_tc_v;\nvoid main() {\n  gl_Position = in_pos;\n  interp_tc_y = in_tc_y;\n  interp_tc_u = in_tc_u;\n  interp_tc_v = in_tc_v;\n}\n", "precision mediump float;\nvarying vec2 interp_tc_y;\nvarying vec2 interp_tc_u;\nvarying vec2 interp_tc_v;\nuniform sampler2D y_tex;\nuniform sampler2D u_tex;\nuniform sampler2D v_tex;\nuniform mat3 mColorConversion;\nvoid main() {\n  vec3 yuv;\n  yuv.x = texture2D(y_tex, interp_tc_y).r - 0.0625;\n  yuv.y = texture2D(u_tex, interp_tc_u).r - 0.5;\n  yuv.z = texture2D(v_tex, interp_tc_v).r - 0.5;\n  gl_FragColor = vec4(mColorConversion * yuv, 1.0);\n}\n");
                this.f85697j = uVar;
                GLES20.glVertexAttribPointer(uVar.getAttributeArrayLocationAndEnable("in_pos"), 2, 5126, false, 0, (Buffer) f85689q);
                iArr[0] = this.f85697j.getAttributeArrayLocationAndEnable(LJjmO.CnGfZiI);
                iArr[1] = this.f85697j.getAttributeArrayLocationAndEnable("in_tc_u");
                iArr[2] = this.f85697j.getAttributeArrayLocationAndEnable("in_tc_v");
                this.f85698k = this.f85697j.getUniformLocation("mColorConversion");
                com.google.android.exoplayer2.util.x.checkGlError();
                int[] iArr2 = this.f85691c;
                try {
                    GLES20.glGenTextures(3, iArr2, 0);
                    for (int i10 = 0; i10 < 3; i10++) {
                        GLES20.glUniform1i(this.f85697j.getUniformLocation(f85688p[i10]), i10);
                        GLES20.glActiveTexture(33984 + i10);
                        com.google.android.exoplayer2.util.x.bindTexture(3553, iArr2[i10]);
                    }
                    com.google.android.exoplayer2.util.x.checkGlError();
                } catch (com.google.android.exoplayer2.util.w e10) {
                    Log.e("VideoDecoderGLSV", "Failed to set up the textures", e10);
                }
                com.google.android.exoplayer2.util.x.checkGlError();
            } catch (com.google.android.exoplayer2.util.w e11) {
                Log.e("VideoDecoderGLSV", "Failed to set up the textures and program", e11);
            }
        }
    }

    public j(Context context) {
        this(context, null);
    }

    @Override // sf.k
    public void setOutputBuffer(ce.n nVar) {
        this.f85684b.setOutputBuffer(nVar);
    }

    public j(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        a aVar = new a(this);
        this.f85684b = aVar;
        setPreserveEGLContextOnPause(true);
        setEGLContextClientVersion(2);
        setRenderer(aVar);
        setRenderMode(0);
    }

    @Deprecated
    public k getVideoDecoderOutputBufferRenderer() {
        return this;
    }
}
