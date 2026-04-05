package io.odeeo.internal.s0;

import android.opengl.GLES20;
import io.odeeo.internal.q0.m;
import io.odeeo.internal.s0.e;
import java.nio.Buffer;
import java.nio.FloatBuffer;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class g {

    /* renamed from: j, reason: collision with root package name */
    public static final String[] f66285j = {"uniform mat4 uMvpMatrix;", "uniform mat3 uTexMatrix;", "attribute vec4 aPosition;", "attribute vec2 aTexCoords;", "varying vec2 vTexCoords;", "void main() {", "  gl_Position = uMvpMatrix * aPosition;", "  vTexCoords = (uTexMatrix * vec3(aTexCoords, 1)).xy;", "}"};

    /* renamed from: k, reason: collision with root package name */
    public static final String[] f66286k = {"#extension GL_OES_EGL_image_external : require", "precision mediump float;", "uniform samplerExternalOES uTexture;", "varying vec2 vTexCoords;", "void main() {", "  gl_FragColor = texture2D(uTexture, vTexCoords);", "}"};

    /* renamed from: l, reason: collision with root package name */
    public static final float[] f66287l = {1.0f, 0.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, 1.0f, 1.0f};

    /* renamed from: m, reason: collision with root package name */
    public static final float[] f66288m = {1.0f, 0.0f, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, 0.5f, 1.0f};

    /* renamed from: n, reason: collision with root package name */
    public static final float[] f66289n = {1.0f, 0.0f, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, 1.0f, 1.0f};

    /* renamed from: o, reason: collision with root package name */
    public static final float[] f66290o = {0.5f, 0.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, 1.0f, 1.0f};

    /* renamed from: p, reason: collision with root package name */
    public static final float[] f66291p = {0.5f, 0.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.5f, 1.0f, 1.0f};

    /* renamed from: a, reason: collision with root package name */
    public int f66292a;

    /* renamed from: b, reason: collision with root package name */
    public a f66293b;

    /* renamed from: c, reason: collision with root package name */
    public a f66294c;

    /* renamed from: d, reason: collision with root package name */
    public m.d f66295d;

    /* renamed from: e, reason: collision with root package name */
    public int f66296e;

    /* renamed from: f, reason: collision with root package name */
    public int f66297f;

    /* renamed from: g, reason: collision with root package name */
    public int f66298g;

    /* renamed from: h, reason: collision with root package name */
    public int f66299h;

    /* renamed from: i, reason: collision with root package name */
    public int f66300i;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public final int f66301a;

        /* renamed from: b, reason: collision with root package name */
        public final FloatBuffer f66302b;

        /* renamed from: c, reason: collision with root package name */
        public final FloatBuffer f66303c;

        /* renamed from: d, reason: collision with root package name */
        public final int f66304d;

        public a(e.b bVar) {
            this.f66301a = bVar.getVertexCount();
            this.f66302b = m.createBuffer(bVar.f66283c);
            this.f66303c = m.createBuffer(bVar.f66284d);
            int i10 = bVar.f66282b;
            if (i10 == 1) {
                this.f66304d = 5;
            } else if (i10 != 2) {
                this.f66304d = 4;
            } else {
                this.f66304d = 6;
            }
        }
    }

    public static boolean isSupported(e eVar) {
        e.a aVar = eVar.f66276a;
        e.a aVar2 = eVar.f66277b;
        return aVar.getSubMeshCount() == 1 && aVar.getSubMesh(0).f66281a == 0 && aVar2.getSubMeshCount() == 1 && aVar2.getSubMesh(0).f66281a == 0;
    }

    public void a() {
        m.d dVar = new m.d(f66285j, f66286k);
        this.f66295d = dVar;
        this.f66296e = dVar.getUniformLocation("uMvpMatrix");
        this.f66297f = this.f66295d.getUniformLocation("uTexMatrix");
        this.f66298g = this.f66295d.getAttribLocation("aPosition");
        this.f66299h = this.f66295d.getAttribLocation("aTexCoords");
        this.f66300i = this.f66295d.getUniformLocation("uTexture");
    }

    public void b() {
        m.d dVar = this.f66295d;
        if (dVar != null) {
            dVar.delete();
        }
    }

    public void setProjection(e eVar) {
        if (isSupported(eVar)) {
            this.f66292a = eVar.f66278c;
            a aVar = new a(eVar.f66276a.getSubMesh(0));
            this.f66293b = aVar;
            if (!eVar.f66279d) {
                aVar = new a(eVar.f66277b.getSubMesh(0));
            }
            this.f66294c = aVar;
        }
    }

    public void a(int i10, float[] fArr, boolean z10) {
        float[] fArr2;
        a aVar = z10 ? this.f66294c : this.f66293b;
        if (aVar == null) {
            return;
        }
        ((m.d) io.odeeo.internal.q0.a.checkNotNull(this.f66295d)).use();
        m.checkGlError();
        GLES20.glEnableVertexAttribArray(this.f66298g);
        GLES20.glEnableVertexAttribArray(this.f66299h);
        m.checkGlError();
        int i11 = this.f66292a;
        if (i11 == 1) {
            fArr2 = z10 ? f66289n : f66288m;
        } else if (i11 == 2) {
            fArr2 = z10 ? f66291p : f66290o;
        } else {
            fArr2 = f66287l;
        }
        GLES20.glUniformMatrix3fv(this.f66297f, 1, false, fArr2, 0);
        GLES20.glUniformMatrix4fv(this.f66296e, 1, false, fArr, 0);
        GLES20.glActiveTexture(33984);
        GLES20.glBindTexture(36197, i10);
        GLES20.glUniform1i(this.f66300i, 0);
        m.checkGlError();
        GLES20.glVertexAttribPointer(this.f66298g, 3, 5126, false, 12, (Buffer) aVar.f66302b);
        m.checkGlError();
        GLES20.glVertexAttribPointer(this.f66299h, 2, 5126, false, 8, (Buffer) aVar.f66303c);
        m.checkGlError();
        GLES20.glDrawArrays(aVar.f66304d, 0, aVar.f66301a);
        m.checkGlError();
        GLES20.glDisableVertexAttribArray(this.f66298g);
        GLES20.glDisableVertexAttribArray(this.f66299h);
    }
}
