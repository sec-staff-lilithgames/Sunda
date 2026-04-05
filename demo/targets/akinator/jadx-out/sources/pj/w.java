package pj;

import wr.l3;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public class w {
    public wr.j providesGrpcChannel(String str) {
        return l3.forTarget(str).build();
    }

    public String providesServiceHost() {
        return "firebaseinappmessaging.googleapis.com";
    }
}
