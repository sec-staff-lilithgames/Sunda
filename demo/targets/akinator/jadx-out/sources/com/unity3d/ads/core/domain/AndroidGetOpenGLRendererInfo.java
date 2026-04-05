package com.unity3d.ads.core.domain;

import android.opengl.GLES20;
import com.google.protobuf.ByteString;
import com.unity3d.ads.core.data.repository.SessionRepository;
import com.unity3d.ads.gl.EglCore;
import com.unity3d.ads.gl.OffscreenSurface;
import kotlin.jvm.internal.e0;
import sv.g;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class AndroidGetOpenGLRendererInfo implements GetOpenGLRendererInfo {
    private final SessionRepository sessionRepository;

    public AndroidGetOpenGLRendererInfo(SessionRepository sessionRepository) {
        e0.checkNotNullParameter(sessionRepository, "sessionRepository");
        this.sessionRepository = sessionRepository;
    }

    @Override // com.unity3d.ads.core.domain.GetOpenGLRendererInfo
    public ByteString invoke() {
        if (!this.sessionRepository.getFeatureFlags().getOpenglGpuEnabled()) {
            ByteString byteStringEmpty = ByteString.empty();
            e0.checkNotNullExpressionValue(byteStringEmpty, "{\n            ByteString.empty()\n        }");
            return byteStringEmpty;
        }
        EglCore eglCore = new EglCore(null, 2);
        OffscreenSurface offscreenSurface = new OffscreenSurface(eglCore, 1, 1);
        offscreenSurface.makeCurrent();
        String renderer = GLES20.glGetString(7937);
        e0.checkNotNullExpressionValue(renderer, "renderer");
        byte[] bytes = renderer.getBytes(g.f86134b);
        e0.checkNotNullExpressionValue(bytes, "this as java.lang.String).getBytes(charset)");
        ByteString byteStringCopyFrom = ByteString.copyFrom(bytes);
        offscreenSurface.release();
        eglCore.release();
        e0.checkNotNullExpressionValue(byteStringCopyFrom, "{\n            // We need…dererByteString\n        }");
        return byteStringCopyFrom;
    }
}
