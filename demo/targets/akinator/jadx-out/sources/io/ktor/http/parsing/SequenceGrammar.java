package io.ktor.http.parsing;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.e0;
import uu.v0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class SequenceGrammar extends Grammar implements ComplexGrammar {
    private final List<Grammar> grammars;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SequenceGrammar(List<? extends Grammar> sourceGrammars) {
        super(null);
        e0.checkNotNullParameter(sourceGrammars, "sourceGrammars");
        ArrayList arrayList = new ArrayList();
        for (Object obj : sourceGrammars) {
            if (obj instanceof SequenceGrammar) {
                v0.addAll(arrayList, ((ComplexGrammar) obj).getGrammars());
            } else {
                arrayList.add(obj);
            }
        }
        this.grammars = arrayList;
    }

    @Override // io.ktor.http.parsing.ComplexGrammar
    public List<Grammar> getGrammars() {
        return this.grammars;
    }
}
