package kotlinx.coroutines.channels;

import io.ktor.http.LinkHeader;
import kotlinx.coroutines.channels.ChannelIterator;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
@bv.f(c = "kotlinx.coroutines.channels.ChannelIterator$DefaultImpls", f = "Channel.kt", i = {0}, l = {1092}, m = LinkHeader.Rel.Next, n = {"$this"}, s = {"L$0"})
/* loaded from: classes10.dex */
public final class ChannelIterator$next0$1<E> extends bv.d {
    Object L$0;
    int label;
    /* synthetic */ Object result;

    public ChannelIterator$next0$1(zu.d<? super ChannelIterator$next0$1> dVar) {
        super(dVar);
    }

    @Override // bv.a
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return ChannelIterator.DefaultImpls.next(null, this);
    }
}
