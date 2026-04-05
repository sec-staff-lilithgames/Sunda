package tf;

import android.opengl.GLES20;
import android.util.Log;
import com.google.android.exoplayer2.util.u;
import com.google.android.exoplayer2.util.w;
import com.google.android.exoplayer2.util.x;
import java.nio.Buffer;
import tf.f;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class i {

    /* renamed from: j, reason: collision with root package name */
    public static final float[] f86860j = {1.0f, 0.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, 1.0f, 1.0f};

    /* renamed from: k, reason: collision with root package name */
    public static final float[] f86861k = {1.0f, 0.0f, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, 0.5f, 1.0f};

    /* renamed from: l, reason: collision with root package name */
    public static final float[] f86862l = {1.0f, 0.0f, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, 1.0f, 1.0f};

    /* renamed from: m, reason: collision with root package name */
    public static final float[] f86863m = {0.5f, 0.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, 1.0f, 1.0f};

    /* renamed from: n, reason: collision with root package name */
    public static final float[] f86864n = {0.5f, 0.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.5f, 1.0f, 1.0f};

    /* renamed from: a, reason: collision with root package name */
    public int f86865a;

    /* renamed from: b, reason: collision with root package name */
    public h f86866b;

    /* renamed from: c, reason: collision with root package name */
    public h f86867c;

    /* renamed from: d, reason: collision with root package name */
    public u f86868d;

    /* renamed from: e, reason: collision with root package name */
    public int f86869e;

    /* renamed from: f, reason: collision with root package name */
    public int f86870f;

    /* renamed from: g, reason: collision with root package name */
    public int f86871g;

    /* renamed from: h, reason: collision with root package name */
    public int f86872h;

    /* renamed from: i, reason: collision with root package name */
    public int f86873i;

    public static boolean isSupported(f fVar) {
        f.a aVar = fVar.f86847a;
        f.a aVar2 = fVar.f86848b;
        return aVar.getSubMeshCount() == 1 && aVar.getSubMesh(0).f86852a == 0 && aVar2.getSubMeshCount() == 1 && aVar2.getSubMesh(0).f86852a == 0;
    }

    public void draw(int i10, float[] fArr, boolean z10) {
        h hVar = z10 ? this.f86867c : this.f86866b;
        if (hVar == null) {
            return;
        }
        int i11 = this.f86865a;
        GLES20.glUniformMatrix3fv(this.f86870f, 1, false, i11 == 1 ? z10 ? f86862l : f86861k : i11 == 2 ? z10 ? f86864n : f86863m : f86860j, 0);
        GLES20.glUniformMatrix4fv(this.f86869e, 1, false, fArr, 0);
        GLES20.glActiveTexture(33984);
        GLES20.glBindTexture(36197, i10);
        GLES20.glUniform1i(this.f86873i, 0);
        try {
            x.checkGlError();
        } catch (w e10) {
            Log.e("ProjectionRenderer", "Failed to bind uniforms", e10);
        }
        GLES20.glVertexAttribPointer(this.f86871g, 3, 5126, false, 12, (Buffer) hVar.f86857b);
        try {
            x.checkGlError();
        } catch (w e11) {
            Log.e("ProjectionRenderer", "Failed to load position data", e11);
        }
        GLES20.glVertexAttribPointer(this.f86872h, 2, 5126, false, 8, (Buffer) hVar.f86858c);
        try {
            x.checkGlError();
        } catch (w e12) {
            Log.e("ProjectionRenderer", "Failed to load texture data", e12);
        }
        GLES20.glDrawArrays(hVar.f86859d, 0, hVar.f86856a);
        try {
            x.checkGlError();
        } catch (w e13) {
            Log.e("ProjectionRenderer", "Failed to render", e13);
        }
    }

    public void init() {
        try {
            u uVar = new u("uniform mat4 uMvpMatrix;\nuniform mat3 uTexMatrix;\nattribute vec4 aPosition;\nattribute vec2 aTexCoords;\nvarying vec2 vTexCoords;\n// Standard transformation.\nvoid main() {\n  gl_Position = uMvpMatrix * aPosition;\n  vTexCoords = (uTexMatrix * vec3(aTexCoords, 1)).xy;\n}\n", "// This is required since the texture data is GL_TEXTURE_EXTERNAL_OES.\n#extension GL_OES_EGL_image_external : require\nprecision mediump float;\n// Standard texture rendering shader.\nuniform samplerExternalOES uTexture;\nvarying vec2 vTexCoords;\nvoid main() {\n  gl_FragColor = texture2D(uTexture, vTexCoords);\n}\n");
            this.f86868d = uVar;
            this.f86869e = uVar.getUniformLocation("uMvpMatrix");
            this.f86870f = this.f86868d.getUniformLocation("uTexMatrix");
            this.f86871g = this.f86868d.getAttributeArrayLocationAndEnable("aPosition");
            this.f86872h = this.f86868d.getAttributeArrayLocationAndEnable("aTexCoords");
            this.f86873i = this.f86868d.getUniformLocation("uTexture");
        } catch (w e10) {
            Log.e("ProjectionRenderer", "Failed to initialize the program", e10);
        }
    }

    public void setProjection(f fVar) {
        if (isSupported(fVar)) {
            this.f86865a = fVar.f86849c;
            h hVar = new h(fVar.f86847a.getSubMesh(0));
            this.f86866b = hVar;
            if (!fVar.f86850d) {
                hVar = new h(fVar.f86848b.getSubMesh(0));
            }
            this.f86867c = hVar;
        }
    }

    public void shutdown() {
        u uVar = this.f86868d;
        if (uVar != null) {
            try {
                uVar.delete();
            } catch (w e10) {
                Log.e("ProjectionRenderer", "Failed to delete the shader program", e10);
            }
        }
    }
}
