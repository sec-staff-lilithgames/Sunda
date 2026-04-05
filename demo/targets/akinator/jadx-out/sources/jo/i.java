package jo;

import android.opengl.GLES20;
import android.util.Log;
import io.bidmachine.media3.common.util.q;
import io.bidmachine.media3.common.util.s;
import io.bidmachine.media3.common.util.t;
import java.nio.Buffer;
import jo.f;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class i {

    /* renamed from: j, reason: collision with root package name */
    public static final float[] f69840j = {1.0f, 0.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, 1.0f, 1.0f};

    /* renamed from: k, reason: collision with root package name */
    public static final float[] f69841k = {1.0f, 0.0f, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, 0.5f, 1.0f};

    /* renamed from: l, reason: collision with root package name */
    public static final float[] f69842l = {1.0f, 0.0f, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, 1.0f, 1.0f};

    /* renamed from: m, reason: collision with root package name */
    public static final float[] f69843m = {0.5f, 0.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, 1.0f, 1.0f};

    /* renamed from: n, reason: collision with root package name */
    public static final float[] f69844n = {0.5f, 0.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.5f, 1.0f, 1.0f};

    /* renamed from: a, reason: collision with root package name */
    public int f69845a;

    /* renamed from: b, reason: collision with root package name */
    public h f69846b;

    /* renamed from: c, reason: collision with root package name */
    public h f69847c;

    /* renamed from: d, reason: collision with root package name */
    public q f69848d;

    /* renamed from: e, reason: collision with root package name */
    public int f69849e;

    /* renamed from: f, reason: collision with root package name */
    public int f69850f;

    /* renamed from: g, reason: collision with root package name */
    public int f69851g;

    /* renamed from: h, reason: collision with root package name */
    public int f69852h;

    /* renamed from: i, reason: collision with root package name */
    public int f69853i;

    public static boolean isSupported(f fVar) {
        f.a aVar = fVar.f69827a;
        f.a aVar2 = fVar.f69828b;
        return aVar.getSubMeshCount() == 1 && aVar.getSubMesh(0).f69832a == 0 && aVar2.getSubMeshCount() == 1 && aVar2.getSubMesh(0).f69832a == 0;
    }

    public void draw(int i10, float[] fArr, boolean z10) {
        h hVar = z10 ? this.f69847c : this.f69846b;
        if (hVar == null) {
            return;
        }
        int i11 = this.f69845a;
        GLES20.glUniformMatrix3fv(this.f69850f, 1, false, i11 == 1 ? z10 ? f69842l : f69841k : i11 == 2 ? z10 ? f69844n : f69843m : f69840j, 0);
        GLES20.glUniformMatrix4fv(this.f69849e, 1, false, fArr, 0);
        GLES20.glActiveTexture(33984);
        GLES20.glBindTexture(36197, i10);
        GLES20.glUniform1i(this.f69853i, 0);
        try {
            t.checkGlError();
        } catch (s e10) {
            Log.e("ProjectionRenderer", "Failed to bind uniforms", e10);
        }
        GLES20.glVertexAttribPointer(this.f69851g, 3, 5126, false, 12, (Buffer) hVar.f69837b);
        try {
            t.checkGlError();
        } catch (s e11) {
            Log.e("ProjectionRenderer", "Failed to load position data", e11);
        }
        GLES20.glVertexAttribPointer(this.f69852h, 2, 5126, false, 8, (Buffer) hVar.f69838c);
        try {
            t.checkGlError();
        } catch (s e12) {
            Log.e("ProjectionRenderer", "Failed to load texture data", e12);
        }
        GLES20.glDrawArrays(hVar.f69839d, 0, hVar.f69836a);
        try {
            t.checkGlError();
        } catch (s e13) {
            Log.e("ProjectionRenderer", "Failed to render", e13);
        }
    }

    public void init() {
        try {
            q qVar = new q("uniform mat4 uMvpMatrix;\nuniform mat3 uTexMatrix;\nattribute vec4 aPosition;\nattribute vec2 aTexCoords;\nvarying vec2 vTexCoords;\n// Standard transformation.\nvoid main() {\n  gl_Position = uMvpMatrix * aPosition;\n  vTexCoords = (uTexMatrix * vec3(aTexCoords, 1)).xy;\n}\n", "// This is required since the texture data is GL_TEXTURE_EXTERNAL_OES.\n#extension GL_OES_EGL_image_external : require\nprecision mediump float;\n// Standard texture rendering shader.\nuniform samplerExternalOES uTexture;\nvarying vec2 vTexCoords;\nvoid main() {\n  gl_FragColor = texture2D(uTexture, vTexCoords);\n}\n");
            this.f69848d = qVar;
            this.f69849e = qVar.getUniformLocation("uMvpMatrix");
            this.f69850f = this.f69848d.getUniformLocation("uTexMatrix");
            this.f69851g = this.f69848d.getAttributeArrayLocationAndEnable("aPosition");
            this.f69852h = this.f69848d.getAttributeArrayLocationAndEnable("aTexCoords");
            this.f69853i = this.f69848d.getUniformLocation("uTexture");
        } catch (s e10) {
            Log.e("ProjectionRenderer", "Failed to initialize the program", e10);
        }
    }

    public void setProjection(f fVar) {
        if (isSupported(fVar)) {
            this.f69845a = fVar.f69829c;
            h hVar = new h(fVar.f69827a.getSubMesh(0));
            this.f69846b = hVar;
            if (!fVar.f69830d) {
                hVar = new h(fVar.f69828b.getSubMesh(0));
            }
            this.f69847c = hVar;
        }
    }

    public void shutdown() {
        q qVar = this.f69848d;
        if (qVar != null) {
            try {
                qVar.delete();
            } catch (s e10) {
                Log.e("ProjectionRenderer", "Failed to delete the shader program", e10);
            }
        }
    }
}
