package rj;

import android.text.TextUtils;
import com.google.firebase.inappmessaging.MessagesProto$Button;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    public String f84431a;

    /* renamed from: b, reason: collision with root package name */
    public h f84432b;

    public b build() {
        return new b(this.f84431a, this.f84432b);
    }

    public a setActionUrl(String str) {
        if (!TextUtils.isEmpty(str)) {
            this.f84431a = str;
        }
        return this;
    }

    public a setButton(h hVar) {
        this.f84432b = hVar;
        return this;
    }

    public a setButton(MessagesProto$Button messagesProto$Button) {
        g gVar = new g();
        gVar.setButtonHexColor(messagesProto$Button.getButtonHexColor());
        gVar.setText(messagesProto$Button.getText());
        return this;
    }
}
