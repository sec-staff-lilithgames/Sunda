package rj;

import android.text.TextUtils;
import com.google.firebase.inappmessaging.MessagesProto$Text;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public class g {

    /* renamed from: a, reason: collision with root package name */
    public x f84452a;

    /* renamed from: b, reason: collision with root package name */
    public String f84453b;

    public h build() {
        if (TextUtils.isEmpty(this.f84453b)) {
            throw new IllegalArgumentException("Button model must have a color");
        }
        x xVar = this.f84452a;
        if (xVar != null) {
            return new h(xVar, this.f84453b);
        }
        throw new IllegalArgumentException("Button model must have text");
    }

    public g setButtonHexColor(String str) {
        this.f84453b = str;
        return this;
    }

    public g setText(x xVar) {
        this.f84452a = xVar;
        return this;
    }

    public g setText(MessagesProto$Text messagesProto$Text) {
        w wVar = new w();
        wVar.setText(messagesProto$Text);
        this.f84452a = wVar.build();
        return this;
    }
}
