package rj;

import com.google.firebase.inappmessaging.model.MessageType;
import java.util.Map;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public class m {

    /* renamed from: a, reason: collision with root package name */
    public l f84477a;

    /* renamed from: b, reason: collision with root package name */
    public b f84478b;

    public n build(i iVar, Map<String, String> map) {
        l lVar = this.f84477a;
        if (lVar == null) {
            throw new IllegalArgumentException("ImageOnly model must have image data");
        }
        b bVar = this.f84478b;
        n nVar = new n(iVar, MessageType.IMAGE_ONLY, map);
        nVar.f84479j = lVar;
        nVar.f84480k = bVar;
        return nVar;
    }

    public m setAction(b bVar) {
        this.f84478b = bVar;
        return this;
    }

    public m setImageData(l lVar) {
        this.f84477a = lVar;
        return this;
    }
}
