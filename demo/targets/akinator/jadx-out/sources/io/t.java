package io;

import android.content.Context;
import android.opengl.GLES20;
import android.opengl.GLSurfaceView;
import android.util.AttributeSet;
import android.util.Log;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.FloatBuffer;
import java.util.concurrent.atomic.AtomicReference;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class t extends GLSurfaceView implements u {

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f68217c = 0;

    /* renamed from: b, reason: collision with root package name */
    public final a f68218b;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a implements GLSurfaceView.Renderer {

        /* renamed from: m, reason: collision with root package name */
        public static final float[] f68219m = {1.164f, 1.164f, 1.164f, 0.0f, -0.392f, 2.017f, 1.596f, -0.813f, 0.0f};

        /* renamed from: n, reason: collision with root package name */
        public static final float[] f68220n = {1.164f, 1.164f, 1.164f, 0.0f, -0.213f, 2.112f, 1.793f, -0.533f, 0.0f};

        /* renamed from: o, reason: collision with root package name */
        public static final float[] f68221o = {1.168f, 1.168f, 1.168f, 0.0f, -0.188f, 2.148f, 1.683f, -0.652f, 0.0f};

        /* renamed from: p, reason: collision with root package name */
        public static final String[] f68222p = {"y_tex", "u_tex", "v_tex"};

        /* renamed from: q, reason: collision with root package name */
        public static final FloatBuffer f68223q = io.bidmachine.media3.common.util.t.createBuffer(new float[]{-1.0f, 1.0f, -1.0f, -1.0f, 1.0f, 1.0f, 1.0f, -1.0f});

        /* renamed from: b, reason: collision with root package name */
        public final GLSurfaceView f68224b;

        /* renamed from: c, reason: collision with root package name */
        public final int[] f68225c = new int[3];

        /* renamed from: e, reason: collision with root package name */
        public final int[] f68226e = new int[3];

        /* renamed from: f, reason: collision with root package name */
        public final int[] f68227f = new int[3];

        /* renamed from: g, reason: collision with root package name */
        public final int[] f68228g = new int[3];

        /* renamed from: h, reason: collision with root package name */
        public final AtomicReference f68229h = new AtomicReference();

        /* renamed from: i, reason: collision with root package name */
        public final FloatBuffer[] f68230i = new FloatBuffer[3];

        /* renamed from: j, reason: collision with root package name */
        public io.bidmachine.media3.common.util.q f68231j;

        /* renamed from: k, reason: collision with root package name */
        public int f68232k;

        /* renamed from: l, reason: collision with root package name */
        public nn.l f68233l;

        public a(GLSurfaceView gLSurfaceView) {
            this.f68224b = gLSurfaceView;
            for (int i10 = 0; i10 < 3; i10++) {
                int[] iArr = this.f68227f;
                this.f68228g[i10] = -1;
                iArr[i10] = -1;
            }
        }

        @Override // android.opengl.GLSurfaceView.Renderer
        public void onDrawFrame(GL10 gl10) {
            nn.l lVar = (nn.l) this.f68229h.getAndSet(null);
            if (lVar == null && this.f68233l == null) {
                return;
            }
            if (lVar != null) {
                nn.l lVar2 = this.f68233l;
                if (lVar2 != null) {
                    lVar2.release();
                }
                this.f68233l = lVar;
            }
            nn.l lVar3 = (nn.l) io.bidmachine.media3.common.util.a.checkNotNull(this.f68233l);
            int i10 = lVar3.f77107k;
            GLES20.glUniformMatrix3fv(this.f68232k, 1, false, i10 != 1 ? i10 != 3 ? f68220n : f68221o : f68219m, 0);
            int[] iArr = (int[]) io.bidmachine.media3.common.util.a.checkNotNull(lVar3.f77106j);
            ByteBuffer[] byteBufferArr = (ByteBuffer[]) io.bidmachine.media3.common.util.a.checkNotNull(lVar3.f77105i);
            int i11 = 0;
            while (i11 < 3) {
                int i12 = i11 == 0 ? lVar3.f77104h : (lVar3.f77104h + 1) / 2;
                GLES20.glActiveTexture(33984 + i11);
                GLES20.glBindTexture(3553, this.f68225c[i11]);
                GLES20.glPixelStorei(3317, 1);
                GLES20.glTexImage2D(3553, 0, 6409, iArr[i11], i12, 0, 6409, 5121, byteBufferArr[i11]);
                i11++;
            }
            int i13 = lVar3.f77103g;
            int i14 = (i13 + 1) / 2;
            int[] iArr2 = {i13, i14, i14};
            for (int i15 = 0; i15 < 3; i15++) {
                int[] iArr3 = this.f68227f;
                int i16 = iArr3[i15];
                int i17 = iArr2[i15];
                int[] iArr4 = this.f68228g;
                if (i16 != i17 || iArr4[i15] != iArr[i15]) {
                    io.bidmachine.media3.common.util.a.checkState(iArr[i15] != 0);
                    float f10 = iArr2[i15] / iArr[i15];
                    FloatBuffer floatBufferCreateBuffer = io.bidmachine.media3.common.util.t.createBuffer(new float[]{0.0f, 0.0f, 0.0f, 1.0f, f10, 0.0f, f10, 1.0f});
                    FloatBuffer[] floatBufferArr = this.f68230i;
                    floatBufferArr[i15] = floatBufferCreateBuffer;
                    GLES20.glVertexAttribPointer(this.f68226e[i15], 2, 5126, false, 0, (Buffer) floatBufferArr[i15]);
                    iArr3[i15] = iArr2[i15];
                    iArr4[i15] = iArr[i15];
                }
            }
            GLES20.glClear(16384);
            GLES20.glDrawArrays(5, 0, 4);
            try {
                io.bidmachine.media3.common.util.t.checkGlError();
            } catch (io.bidmachine.media3.common.util.s e10) {
                Log.e("VideoDecoderGLSV", "Failed to draw a frame", e10);
            }
        }

        @Override // android.opengl.GLSurfaceView.Renderer
        public void onSurfaceChanged(GL10 gl10, int i10, int i11) {
            GLES20.glViewport(0, 0, i10, i11);
        }

        @Override // android.opengl.GLSurfaceView.Renderer
        public void onSurfaceCreated(GL10 gl10, EGLConfig eGLConfig) {
            int[] iArr = this.f68226e;
            try {
                io.bidmachine.media3.common.util.q qVar = new io.bidmachine.media3.common.util.q("varying vec2 interp_tc_y;\nvarying vec2 interp_tc_u;\nvarying vec2 interp_tc_v;\nattribute vec4 in_pos;\nattribute vec2 in_tc_y;\nattribute vec2 in_tc_u;\nattribute vec2 in_tc_v;\nvoid main() {\n  gl_Position = in_pos;\n  interp_tc_y = in_tc_y;\n  interp_tc_u = in_tc_u;\n  interp_tc_v = in_tc_v;\n}\n", "precision mediump float;\nvarying vec2 interp_tc_y;\nvarying vec2 interp_tc_u;\nvarying vec2 interp_tc_v;\nuniform sampler2D y_tex;\nuniform sampler2D u_tex;\nuniform sampler2D v_tex;\nuniform mat3 mColorConversion;\nvoid main() {\n  vec3 yuv;\n  yuv.x = texture2D(y_tex, interp_tc_y).r - 0.0625;\n  yuv.y = texture2D(u_tex, interp_tc_u).r - 0.5;\n  yuv.z = texture2D(v_tex, interp_tc_v).r - 0.5;\n  gl_FragColor = vec4(mColorConversion * yuv, 1.0);\n}\n");
                this.f68231j = qVar;
                GLES20.glVertexAttribPointer(qVar.getAttributeArrayLocationAndEnable("in_pos"), 2, 5126, false, 0, (Buffer) f68223q);
                iArr[0] = this.f68231j.getAttributeArrayLocationAndEnable("in_tc_y");
                iArr[1] = this.f68231j.getAttributeArrayLocationAndEnable("in_tc_u");
                iArr[2] = this.f68231j.getAttributeArrayLocationAndEnable("in_tc_v");
                this.f68232k = this.f68231j.getUniformLocation("mColorConversion");
                io.bidmachine.media3.common.util.t.checkGlError();
                int[] iArr2 = this.f68225c;
                try {
                    GLES20.glGenTextures(3, iArr2, 0);
                    for (int i10 = 0; i10 < 3; i10++) {
                        GLES20.glUniform1i(this.f68231j.getUniformLocation(f68222p[i10]), i10);
                        GLES20.glActiveTexture(33984 + i10);
                        io.bidmachine.media3.common.util.t.bindTexture(3553, iArr2[i10], 9729);
                    }
                    io.bidmachine.media3.common.util.t.checkGlError();
                } catch (io.bidmachine.media3.common.util.s e10) {
                    Log.e("VideoDecoderGLSV", "Failed to set up the textures", e10);
                }
                io.bidmachine.media3.common.util.t.checkGlError();
            } catch (io.bidmachine.media3.common.util.s e11) {
                Log.e("VideoDecoderGLSV", "Failed to set up the textures and program", e11);
            }
        }

        public void setOutputBuffer(nn.l lVar) {
            nn.l lVar2 = (nn.l) this.f68229h.getAndSet(lVar);
            if (lVar2 != null) {
                lVar2.release();
            }
            this.f68224b.requestRender();
        }
    }

    public t(Context context) {
        this(context, null);
    }

    @Override // io.u
    public void setOutputBuffer(nn.l lVar) {
        this.f68218b.setOutputBuffer(lVar);
    }

    public t(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        a aVar = new a(this);
        this.f68218b = aVar;
        setPreserveEGLContextOnPause(true);
        setEGLContextClientVersion(2);
        setRenderer(aVar);
        setRenderMode(0);
    }

    @Deprecated
    public u getVideoDecoderOutputBufferRenderer() {
        return this;
    }
}
