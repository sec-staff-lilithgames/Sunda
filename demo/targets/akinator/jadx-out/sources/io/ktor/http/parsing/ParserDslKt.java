package io.ktor.http.parsing;

import com.google.android.gms.ads.RequestConfiguration;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.f0;
import kv.a;
import kv.l;
import uu.p0;
import uu.v0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class ParserDslKt {

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: io.ktor.http.parsing.ParserDslKt$maybe$1, reason: invalid class name */
    public static final class AnonymousClass1 extends f0 implements a {
        final /* synthetic */ l $block;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(l lVar) {
            super(0);
            this.$block = lVar;
        }

        @Override // kv.a
        public final Grammar invoke() {
            GrammarBuilder grammarBuilder = new GrammarBuilder();
            this.$block.invoke(grammarBuilder);
            return ParserDslKt.maybe(grammarBuilder.build());
        }
    }

    public static final Grammar anyOf(String value) {
        e0.checkNotNullParameter(value, "value");
        return new AnyOfGrammar(value);
    }

    public static final Grammar atLeastOne(Grammar grammar) {
        e0.checkNotNullParameter(grammar, "grammar");
        return new AtLeastOne(grammar);
    }

    public static final /* synthetic */ <T extends ComplexGrammar> List<Grammar> flatten(List<? extends Grammar> list) {
        e0.checkNotNullParameter(list, "<this>");
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            e0.reifiedOperationMarker(3, RequestConfiguration.MAX_AD_CONTENT_RATING_T);
            if (obj instanceof ComplexGrammar) {
                v0.addAll(arrayList, ((ComplexGrammar) obj).getGrammars());
            } else {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public static final Grammar many(Grammar grammar) {
        e0.checkNotNullParameter(grammar, "grammar");
        return new ManyGrammar(grammar);
    }

    public static final Grammar maybe(Grammar grammar) {
        e0.checkNotNullParameter(grammar, "grammar");
        return new MaybeGrammar(grammar);
    }

    public static final Grammar named(Grammar grammar, String name) {
        e0.checkNotNullParameter(grammar, "<this>");
        e0.checkNotNullParameter(name, "name");
        return new NamedGrammar(name, grammar);
    }

    public static final Grammar or(Grammar grammar, Grammar grammar2) {
        e0.checkNotNullParameter(grammar, "<this>");
        e0.checkNotNullParameter(grammar2, "grammar");
        return new OrGrammar(p0.listOf((Object[]) new Grammar[]{grammar, grammar2}));
    }

    public static final Grammar then(String str, Grammar grammar) {
        e0.checkNotNullParameter(str, "<this>");
        e0.checkNotNullParameter(grammar, "grammar");
        return then(new StringGrammar(str), grammar);
    }

    public static final Grammar to(char c10, char c11) {
        return new RangeGrammar(c10, c11);
    }

    public static final Grammar maybe(String value) {
        e0.checkNotNullParameter(value, "value");
        return new MaybeGrammar(new StringGrammar(value));
    }

    public static final Grammar or(Grammar grammar, String value) {
        e0.checkNotNullParameter(grammar, "<this>");
        e0.checkNotNullParameter(value, "value");
        return or(grammar, new StringGrammar(value));
    }

    public static final Grammar then(Grammar grammar, Grammar grammar2) {
        e0.checkNotNullParameter(grammar, "<this>");
        e0.checkNotNullParameter(grammar2, "grammar");
        return new SequenceGrammar(p0.listOf((Object[]) new Grammar[]{grammar, grammar2}));
    }

    public static final a maybe(l block) {
        e0.checkNotNullParameter(block, "block");
        return new AnonymousClass1(block);
    }

    public static final Grammar or(String str, Grammar grammar) {
        e0.checkNotNullParameter(str, "<this>");
        e0.checkNotNullParameter(grammar, "grammar");
        return or(new StringGrammar(str), grammar);
    }

    public static final Grammar then(Grammar grammar, String value) {
        e0.checkNotNullParameter(grammar, "<this>");
        e0.checkNotNullParameter(value, "value");
        return then(grammar, new StringGrammar(value));
    }
}
