package io.ktor.http.parsing.regex;

import io.ktor.http.parsing.ParseResult;
import io.ktor.http.parsing.Parser;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.e0;
import sv.o;
import sv.t;
import sv.v;
import sv.x;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class RegexParser implements Parser {
    private final x expression;
    private final Map<String, List<Integer>> indexes;

    /* JADX WARN: Multi-variable type inference failed */
    public RegexParser(x expression, Map<String, ? extends List<Integer>> indexes) {
        e0.checkNotNullParameter(expression, "expression");
        e0.checkNotNullParameter(indexes, "indexes");
        this.expression = expression;
        this.indexes = indexes;
    }

    @Override // io.ktor.http.parsing.Parser
    public boolean match(String input) {
        e0.checkNotNullParameter(input, "input");
        return this.expression.matches(input);
    }

    @Override // io.ktor.http.parsing.Parser
    public ParseResult parse(String input) {
        e0.checkNotNullParameter(input, "input");
        t tVarMatchEntire = this.expression.matchEntire(input);
        if (tVarMatchEntire == null || tVarMatchEntire.getValue().length() != input.length()) {
            return null;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<String, List<Integer>> entry : this.indexes.entrySet()) {
            String key = entry.getKey();
            Iterator<T> it = entry.getValue().iterator();
            while (it.hasNext()) {
                int iIntValue = ((Number) it.next()).intValue();
                ArrayList arrayList = new ArrayList();
                o oVar = ((v) tVarMatchEntire.getGroups()).get(iIntValue);
                if (oVar != null) {
                    arrayList.add(oVar.getValue());
                }
                if (!arrayList.isEmpty()) {
                    linkedHashMap.put(key, arrayList);
                }
            }
        }
        return new ParseResult(linkedHashMap);
    }
}
