package de.tgremple.siteanalyser.configuration.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import de.tgremple.siteanalyser.configuration.services.ConfigurationLanguageGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalConfigurationLanguageParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'content'", "'type'", "'is'", "'recognized'", "'by'", "'recognize'", "'page'", "'css'", "'url'", "'pattern'", "'as'"
    };
    public static final int RULE_STRING=5;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int RULE_ID=4;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_INT=6;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalConfigurationLanguageParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalConfigurationLanguageParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalConfigurationLanguageParser.tokenNames; }
    public String getGrammarFileName() { return "InternalConfigurationLanguage.g"; }


    	private ConfigurationLanguageGrammarAccess grammarAccess;

    	public void setGrammarAccess(ConfigurationLanguageGrammarAccess grammarAccess) {
    		this.grammarAccess = grammarAccess;
    	}

    	@Override
    	protected Grammar getGrammar() {
    		return grammarAccess.getGrammar();
    	}

    	@Override
    	protected String getValueForTokenName(String tokenName) {
    		return tokenName;
    	}



    // $ANTLR start "entryRuleSiteStructure"
    // InternalConfigurationLanguage.g:53:1: entryRuleSiteStructure : ruleSiteStructure EOF ;
    public final void entryRuleSiteStructure() throws RecognitionException {
        try {
            // InternalConfigurationLanguage.g:54:1: ( ruleSiteStructure EOF )
            // InternalConfigurationLanguage.g:55:1: ruleSiteStructure EOF
            {
             before(grammarAccess.getSiteStructureRule()); 
            pushFollow(FOLLOW_1);
            ruleSiteStructure();

            state._fsp--;

             after(grammarAccess.getSiteStructureRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSiteStructure"


    // $ANTLR start "ruleSiteStructure"
    // InternalConfigurationLanguage.g:62:1: ruleSiteStructure : ( ( rule__SiteStructure__TypeDefinitionsAssignment )* ) ;
    public final void ruleSiteStructure() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConfigurationLanguage.g:66:2: ( ( ( rule__SiteStructure__TypeDefinitionsAssignment )* ) )
            // InternalConfigurationLanguage.g:67:2: ( ( rule__SiteStructure__TypeDefinitionsAssignment )* )
            {
            // InternalConfigurationLanguage.g:67:2: ( ( rule__SiteStructure__TypeDefinitionsAssignment )* )
            // InternalConfigurationLanguage.g:68:3: ( rule__SiteStructure__TypeDefinitionsAssignment )*
            {
             before(grammarAccess.getSiteStructureAccess().getTypeDefinitionsAssignment()); 
            // InternalConfigurationLanguage.g:69:3: ( rule__SiteStructure__TypeDefinitionsAssignment )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==11||LA1_0==17) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalConfigurationLanguage.g:69:4: rule__SiteStructure__TypeDefinitionsAssignment
            	    {
            	    pushFollow(FOLLOW_3);
            	    rule__SiteStructure__TypeDefinitionsAssignment();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

             after(grammarAccess.getSiteStructureAccess().getTypeDefinitionsAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSiteStructure"


    // $ANTLR start "entryRuleType"
    // InternalConfigurationLanguage.g:78:1: entryRuleType : ruleType EOF ;
    public final void entryRuleType() throws RecognitionException {
        try {
            // InternalConfigurationLanguage.g:79:1: ( ruleType EOF )
            // InternalConfigurationLanguage.g:80:1: ruleType EOF
            {
             before(grammarAccess.getTypeRule()); 
            pushFollow(FOLLOW_1);
            ruleType();

            state._fsp--;

             after(grammarAccess.getTypeRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleType"


    // $ANTLR start "ruleType"
    // InternalConfigurationLanguage.g:87:1: ruleType : ( ( rule__Type__Alternatives ) ) ;
    public final void ruleType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConfigurationLanguage.g:91:2: ( ( ( rule__Type__Alternatives ) ) )
            // InternalConfigurationLanguage.g:92:2: ( ( rule__Type__Alternatives ) )
            {
            // InternalConfigurationLanguage.g:92:2: ( ( rule__Type__Alternatives ) )
            // InternalConfigurationLanguage.g:93:3: ( rule__Type__Alternatives )
            {
             before(grammarAccess.getTypeAccess().getAlternatives()); 
            // InternalConfigurationLanguage.g:94:3: ( rule__Type__Alternatives )
            // InternalConfigurationLanguage.g:94:4: rule__Type__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Type__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getTypeAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleType"


    // $ANTLR start "entryRuleContentType"
    // InternalConfigurationLanguage.g:103:1: entryRuleContentType : ruleContentType EOF ;
    public final void entryRuleContentType() throws RecognitionException {
        try {
            // InternalConfigurationLanguage.g:104:1: ( ruleContentType EOF )
            // InternalConfigurationLanguage.g:105:1: ruleContentType EOF
            {
             before(grammarAccess.getContentTypeRule()); 
            pushFollow(FOLLOW_1);
            ruleContentType();

            state._fsp--;

             after(grammarAccess.getContentTypeRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleContentType"


    // $ANTLR start "ruleContentType"
    // InternalConfigurationLanguage.g:112:1: ruleContentType : ( ( rule__ContentType__Group__0 ) ) ;
    public final void ruleContentType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConfigurationLanguage.g:116:2: ( ( ( rule__ContentType__Group__0 ) ) )
            // InternalConfigurationLanguage.g:117:2: ( ( rule__ContentType__Group__0 ) )
            {
            // InternalConfigurationLanguage.g:117:2: ( ( rule__ContentType__Group__0 ) )
            // InternalConfigurationLanguage.g:118:3: ( rule__ContentType__Group__0 )
            {
             before(grammarAccess.getContentTypeAccess().getGroup()); 
            // InternalConfigurationLanguage.g:119:3: ( rule__ContentType__Group__0 )
            // InternalConfigurationLanguage.g:119:4: rule__ContentType__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ContentType__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getContentTypeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleContentType"


    // $ANTLR start "entryRulePageType"
    // InternalConfigurationLanguage.g:128:1: entryRulePageType : rulePageType EOF ;
    public final void entryRulePageType() throws RecognitionException {
        try {
            // InternalConfigurationLanguage.g:129:1: ( rulePageType EOF )
            // InternalConfigurationLanguage.g:130:1: rulePageType EOF
            {
             before(grammarAccess.getPageTypeRule()); 
            pushFollow(FOLLOW_1);
            rulePageType();

            state._fsp--;

             after(grammarAccess.getPageTypeRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulePageType"


    // $ANTLR start "rulePageType"
    // InternalConfigurationLanguage.g:137:1: rulePageType : ( ( rule__PageType__Group__0 ) ) ;
    public final void rulePageType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConfigurationLanguage.g:141:2: ( ( ( rule__PageType__Group__0 ) ) )
            // InternalConfigurationLanguage.g:142:2: ( ( rule__PageType__Group__0 ) )
            {
            // InternalConfigurationLanguage.g:142:2: ( ( rule__PageType__Group__0 ) )
            // InternalConfigurationLanguage.g:143:3: ( rule__PageType__Group__0 )
            {
             before(grammarAccess.getPageTypeAccess().getGroup()); 
            // InternalConfigurationLanguage.g:144:3: ( rule__PageType__Group__0 )
            // InternalConfigurationLanguage.g:144:4: rule__PageType__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__PageType__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPageTypeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePageType"


    // $ANTLR start "entryRuleContentSelector"
    // InternalConfigurationLanguage.g:153:1: entryRuleContentSelector : ruleContentSelector EOF ;
    public final void entryRuleContentSelector() throws RecognitionException {
        try {
            // InternalConfigurationLanguage.g:154:1: ( ruleContentSelector EOF )
            // InternalConfigurationLanguage.g:155:1: ruleContentSelector EOF
            {
             before(grammarAccess.getContentSelectorRule()); 
            pushFollow(FOLLOW_1);
            ruleContentSelector();

            state._fsp--;

             after(grammarAccess.getContentSelectorRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleContentSelector"


    // $ANTLR start "ruleContentSelector"
    // InternalConfigurationLanguage.g:162:1: ruleContentSelector : ( ruleCssSelector ) ;
    public final void ruleContentSelector() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConfigurationLanguage.g:166:2: ( ( ruleCssSelector ) )
            // InternalConfigurationLanguage.g:167:2: ( ruleCssSelector )
            {
            // InternalConfigurationLanguage.g:167:2: ( ruleCssSelector )
            // InternalConfigurationLanguage.g:168:3: ruleCssSelector
            {
             before(grammarAccess.getContentSelectorAccess().getCssSelectorParserRuleCall()); 
            pushFollow(FOLLOW_2);
            ruleCssSelector();

            state._fsp--;

             after(grammarAccess.getContentSelectorAccess().getCssSelectorParserRuleCall()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleContentSelector"


    // $ANTLR start "entryRulePageSelector"
    // InternalConfigurationLanguage.g:178:1: entryRulePageSelector : rulePageSelector EOF ;
    public final void entryRulePageSelector() throws RecognitionException {
        try {
            // InternalConfigurationLanguage.g:179:1: ( rulePageSelector EOF )
            // InternalConfigurationLanguage.g:180:1: rulePageSelector EOF
            {
             before(grammarAccess.getPageSelectorRule()); 
            pushFollow(FOLLOW_1);
            rulePageSelector();

            state._fsp--;

             after(grammarAccess.getPageSelectorRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulePageSelector"


    // $ANTLR start "rulePageSelector"
    // InternalConfigurationLanguage.g:187:1: rulePageSelector : ( ( rule__PageSelector__Alternatives ) ) ;
    public final void rulePageSelector() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConfigurationLanguage.g:191:2: ( ( ( rule__PageSelector__Alternatives ) ) )
            // InternalConfigurationLanguage.g:192:2: ( ( rule__PageSelector__Alternatives ) )
            {
            // InternalConfigurationLanguage.g:192:2: ( ( rule__PageSelector__Alternatives ) )
            // InternalConfigurationLanguage.g:193:3: ( rule__PageSelector__Alternatives )
            {
             before(grammarAccess.getPageSelectorAccess().getAlternatives()); 
            // InternalConfigurationLanguage.g:194:3: ( rule__PageSelector__Alternatives )
            // InternalConfigurationLanguage.g:194:4: rule__PageSelector__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__PageSelector__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getPageSelectorAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePageSelector"


    // $ANTLR start "entryRuleCssSelector"
    // InternalConfigurationLanguage.g:203:1: entryRuleCssSelector : ruleCssSelector EOF ;
    public final void entryRuleCssSelector() throws RecognitionException {
        try {
            // InternalConfigurationLanguage.g:204:1: ( ruleCssSelector EOF )
            // InternalConfigurationLanguage.g:205:1: ruleCssSelector EOF
            {
             before(grammarAccess.getCssSelectorRule()); 
            pushFollow(FOLLOW_1);
            ruleCssSelector();

            state._fsp--;

             after(grammarAccess.getCssSelectorRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleCssSelector"


    // $ANTLR start "ruleCssSelector"
    // InternalConfigurationLanguage.g:212:1: ruleCssSelector : ( ( rule__CssSelector__Group__0 ) ) ;
    public final void ruleCssSelector() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConfigurationLanguage.g:216:2: ( ( ( rule__CssSelector__Group__0 ) ) )
            // InternalConfigurationLanguage.g:217:2: ( ( rule__CssSelector__Group__0 ) )
            {
            // InternalConfigurationLanguage.g:217:2: ( ( rule__CssSelector__Group__0 ) )
            // InternalConfigurationLanguage.g:218:3: ( rule__CssSelector__Group__0 )
            {
             before(grammarAccess.getCssSelectorAccess().getGroup()); 
            // InternalConfigurationLanguage.g:219:3: ( rule__CssSelector__Group__0 )
            // InternalConfigurationLanguage.g:219:4: rule__CssSelector__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__CssSelector__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCssSelectorAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCssSelector"


    // $ANTLR start "entryRuleUrlPatternSelector"
    // InternalConfigurationLanguage.g:228:1: entryRuleUrlPatternSelector : ruleUrlPatternSelector EOF ;
    public final void entryRuleUrlPatternSelector() throws RecognitionException {
        try {
            // InternalConfigurationLanguage.g:229:1: ( ruleUrlPatternSelector EOF )
            // InternalConfigurationLanguage.g:230:1: ruleUrlPatternSelector EOF
            {
             before(grammarAccess.getUrlPatternSelectorRule()); 
            pushFollow(FOLLOW_1);
            ruleUrlPatternSelector();

            state._fsp--;

             after(grammarAccess.getUrlPatternSelectorRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleUrlPatternSelector"


    // $ANTLR start "ruleUrlPatternSelector"
    // InternalConfigurationLanguage.g:237:1: ruleUrlPatternSelector : ( ( rule__UrlPatternSelector__Group__0 ) ) ;
    public final void ruleUrlPatternSelector() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConfigurationLanguage.g:241:2: ( ( ( rule__UrlPatternSelector__Group__0 ) ) )
            // InternalConfigurationLanguage.g:242:2: ( ( rule__UrlPatternSelector__Group__0 ) )
            {
            // InternalConfigurationLanguage.g:242:2: ( ( rule__UrlPatternSelector__Group__0 ) )
            // InternalConfigurationLanguage.g:243:3: ( rule__UrlPatternSelector__Group__0 )
            {
             before(grammarAccess.getUrlPatternSelectorAccess().getGroup()); 
            // InternalConfigurationLanguage.g:244:3: ( rule__UrlPatternSelector__Group__0 )
            // InternalConfigurationLanguage.g:244:4: rule__UrlPatternSelector__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__UrlPatternSelector__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getUrlPatternSelectorAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleUrlPatternSelector"


    // $ANTLR start "entryRuleProperty"
    // InternalConfigurationLanguage.g:253:1: entryRuleProperty : ruleProperty EOF ;
    public final void entryRuleProperty() throws RecognitionException {
        try {
            // InternalConfigurationLanguage.g:254:1: ( ruleProperty EOF )
            // InternalConfigurationLanguage.g:255:1: ruleProperty EOF
            {
             before(grammarAccess.getPropertyRule()); 
            pushFollow(FOLLOW_1);
            ruleProperty();

            state._fsp--;

             after(grammarAccess.getPropertyRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleProperty"


    // $ANTLR start "ruleProperty"
    // InternalConfigurationLanguage.g:262:1: ruleProperty : ( ( rule__Property__Group__0 ) ) ;
    public final void ruleProperty() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConfigurationLanguage.g:266:2: ( ( ( rule__Property__Group__0 ) ) )
            // InternalConfigurationLanguage.g:267:2: ( ( rule__Property__Group__0 ) )
            {
            // InternalConfigurationLanguage.g:267:2: ( ( rule__Property__Group__0 ) )
            // InternalConfigurationLanguage.g:268:3: ( rule__Property__Group__0 )
            {
             before(grammarAccess.getPropertyAccess().getGroup()); 
            // InternalConfigurationLanguage.g:269:3: ( rule__Property__Group__0 )
            // InternalConfigurationLanguage.g:269:4: rule__Property__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Property__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPropertyAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleProperty"


    // $ANTLR start "rule__Type__Alternatives"
    // InternalConfigurationLanguage.g:277:1: rule__Type__Alternatives : ( ( ruleContentType ) | ( rulePageType ) );
    public final void rule__Type__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConfigurationLanguage.g:281:1: ( ( ruleContentType ) | ( rulePageType ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==11) ) {
                alt2=1;
            }
            else if ( (LA2_0==17) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalConfigurationLanguage.g:282:2: ( ruleContentType )
                    {
                    // InternalConfigurationLanguage.g:282:2: ( ruleContentType )
                    // InternalConfigurationLanguage.g:283:3: ruleContentType
                    {
                     before(grammarAccess.getTypeAccess().getContentTypeParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleContentType();

                    state._fsp--;

                     after(grammarAccess.getTypeAccess().getContentTypeParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalConfigurationLanguage.g:288:2: ( rulePageType )
                    {
                    // InternalConfigurationLanguage.g:288:2: ( rulePageType )
                    // InternalConfigurationLanguage.g:289:3: rulePageType
                    {
                     before(grammarAccess.getTypeAccess().getPageTypeParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    rulePageType();

                    state._fsp--;

                     after(grammarAccess.getTypeAccess().getPageTypeParserRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Alternatives"


    // $ANTLR start "rule__PageSelector__Alternatives"
    // InternalConfigurationLanguage.g:298:1: rule__PageSelector__Alternatives : ( ( ruleCssSelector ) | ( ruleUrlPatternSelector ) );
    public final void rule__PageSelector__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConfigurationLanguage.g:302:1: ( ( ruleCssSelector ) | ( ruleUrlPatternSelector ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==18) ) {
                alt3=1;
            }
            else if ( (LA3_0==19) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalConfigurationLanguage.g:303:2: ( ruleCssSelector )
                    {
                    // InternalConfigurationLanguage.g:303:2: ( ruleCssSelector )
                    // InternalConfigurationLanguage.g:304:3: ruleCssSelector
                    {
                     before(grammarAccess.getPageSelectorAccess().getCssSelectorParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleCssSelector();

                    state._fsp--;

                     after(grammarAccess.getPageSelectorAccess().getCssSelectorParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalConfigurationLanguage.g:309:2: ( ruleUrlPatternSelector )
                    {
                    // InternalConfigurationLanguage.g:309:2: ( ruleUrlPatternSelector )
                    // InternalConfigurationLanguage.g:310:3: ruleUrlPatternSelector
                    {
                     before(grammarAccess.getPageSelectorAccess().getUrlPatternSelectorParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleUrlPatternSelector();

                    state._fsp--;

                     after(grammarAccess.getPageSelectorAccess().getUrlPatternSelectorParserRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PageSelector__Alternatives"


    // $ANTLR start "rule__ContentType__Group__0"
    // InternalConfigurationLanguage.g:319:1: rule__ContentType__Group__0 : rule__ContentType__Group__0__Impl rule__ContentType__Group__1 ;
    public final void rule__ContentType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConfigurationLanguage.g:323:1: ( rule__ContentType__Group__0__Impl rule__ContentType__Group__1 )
            // InternalConfigurationLanguage.g:324:2: rule__ContentType__Group__0__Impl rule__ContentType__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__ContentType__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ContentType__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ContentType__Group__0"


    // $ANTLR start "rule__ContentType__Group__0__Impl"
    // InternalConfigurationLanguage.g:331:1: rule__ContentType__Group__0__Impl : ( 'content' ) ;
    public final void rule__ContentType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConfigurationLanguage.g:335:1: ( ( 'content' ) )
            // InternalConfigurationLanguage.g:336:1: ( 'content' )
            {
            // InternalConfigurationLanguage.g:336:1: ( 'content' )
            // InternalConfigurationLanguage.g:337:2: 'content'
            {
             before(grammarAccess.getContentTypeAccess().getContentKeyword_0()); 
            match(input,11,FOLLOW_2); 
             after(grammarAccess.getContentTypeAccess().getContentKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ContentType__Group__0__Impl"


    // $ANTLR start "rule__ContentType__Group__1"
    // InternalConfigurationLanguage.g:346:1: rule__ContentType__Group__1 : rule__ContentType__Group__1__Impl rule__ContentType__Group__2 ;
    public final void rule__ContentType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConfigurationLanguage.g:350:1: ( rule__ContentType__Group__1__Impl rule__ContentType__Group__2 )
            // InternalConfigurationLanguage.g:351:2: rule__ContentType__Group__1__Impl rule__ContentType__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__ContentType__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ContentType__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ContentType__Group__1"


    // $ANTLR start "rule__ContentType__Group__1__Impl"
    // InternalConfigurationLanguage.g:358:1: rule__ContentType__Group__1__Impl : ( 'type' ) ;
    public final void rule__ContentType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConfigurationLanguage.g:362:1: ( ( 'type' ) )
            // InternalConfigurationLanguage.g:363:1: ( 'type' )
            {
            // InternalConfigurationLanguage.g:363:1: ( 'type' )
            // InternalConfigurationLanguage.g:364:2: 'type'
            {
             before(grammarAccess.getContentTypeAccess().getTypeKeyword_1()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getContentTypeAccess().getTypeKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ContentType__Group__1__Impl"


    // $ANTLR start "rule__ContentType__Group__2"
    // InternalConfigurationLanguage.g:373:1: rule__ContentType__Group__2 : rule__ContentType__Group__2__Impl rule__ContentType__Group__3 ;
    public final void rule__ContentType__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConfigurationLanguage.g:377:1: ( rule__ContentType__Group__2__Impl rule__ContentType__Group__3 )
            // InternalConfigurationLanguage.g:378:2: rule__ContentType__Group__2__Impl rule__ContentType__Group__3
            {
            pushFollow(FOLLOW_6);
            rule__ContentType__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ContentType__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ContentType__Group__2"


    // $ANTLR start "rule__ContentType__Group__2__Impl"
    // InternalConfigurationLanguage.g:385:1: rule__ContentType__Group__2__Impl : ( ( rule__ContentType__NameAssignment_2 ) ) ;
    public final void rule__ContentType__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConfigurationLanguage.g:389:1: ( ( ( rule__ContentType__NameAssignment_2 ) ) )
            // InternalConfigurationLanguage.g:390:1: ( ( rule__ContentType__NameAssignment_2 ) )
            {
            // InternalConfigurationLanguage.g:390:1: ( ( rule__ContentType__NameAssignment_2 ) )
            // InternalConfigurationLanguage.g:391:2: ( rule__ContentType__NameAssignment_2 )
            {
             before(grammarAccess.getContentTypeAccess().getNameAssignment_2()); 
            // InternalConfigurationLanguage.g:392:2: ( rule__ContentType__NameAssignment_2 )
            // InternalConfigurationLanguage.g:392:3: rule__ContentType__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__ContentType__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getContentTypeAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ContentType__Group__2__Impl"


    // $ANTLR start "rule__ContentType__Group__3"
    // InternalConfigurationLanguage.g:400:1: rule__ContentType__Group__3 : rule__ContentType__Group__3__Impl rule__ContentType__Group__4 ;
    public final void rule__ContentType__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConfigurationLanguage.g:404:1: ( rule__ContentType__Group__3__Impl rule__ContentType__Group__4 )
            // InternalConfigurationLanguage.g:405:2: rule__ContentType__Group__3__Impl rule__ContentType__Group__4
            {
            pushFollow(FOLLOW_7);
            rule__ContentType__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ContentType__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ContentType__Group__3"


    // $ANTLR start "rule__ContentType__Group__3__Impl"
    // InternalConfigurationLanguage.g:412:1: rule__ContentType__Group__3__Impl : ( 'is' ) ;
    public final void rule__ContentType__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConfigurationLanguage.g:416:1: ( ( 'is' ) )
            // InternalConfigurationLanguage.g:417:1: ( 'is' )
            {
            // InternalConfigurationLanguage.g:417:1: ( 'is' )
            // InternalConfigurationLanguage.g:418:2: 'is'
            {
             before(grammarAccess.getContentTypeAccess().getIsKeyword_3()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getContentTypeAccess().getIsKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ContentType__Group__3__Impl"


    // $ANTLR start "rule__ContentType__Group__4"
    // InternalConfigurationLanguage.g:427:1: rule__ContentType__Group__4 : rule__ContentType__Group__4__Impl rule__ContentType__Group__5 ;
    public final void rule__ContentType__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConfigurationLanguage.g:431:1: ( rule__ContentType__Group__4__Impl rule__ContentType__Group__5 )
            // InternalConfigurationLanguage.g:432:2: rule__ContentType__Group__4__Impl rule__ContentType__Group__5
            {
            pushFollow(FOLLOW_8);
            rule__ContentType__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ContentType__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ContentType__Group__4"


    // $ANTLR start "rule__ContentType__Group__4__Impl"
    // InternalConfigurationLanguage.g:439:1: rule__ContentType__Group__4__Impl : ( 'recognized' ) ;
    public final void rule__ContentType__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConfigurationLanguage.g:443:1: ( ( 'recognized' ) )
            // InternalConfigurationLanguage.g:444:1: ( 'recognized' )
            {
            // InternalConfigurationLanguage.g:444:1: ( 'recognized' )
            // InternalConfigurationLanguage.g:445:2: 'recognized'
            {
             before(grammarAccess.getContentTypeAccess().getRecognizedKeyword_4()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getContentTypeAccess().getRecognizedKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ContentType__Group__4__Impl"


    // $ANTLR start "rule__ContentType__Group__5"
    // InternalConfigurationLanguage.g:454:1: rule__ContentType__Group__5 : rule__ContentType__Group__5__Impl rule__ContentType__Group__6 ;
    public final void rule__ContentType__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConfigurationLanguage.g:458:1: ( rule__ContentType__Group__5__Impl rule__ContentType__Group__6 )
            // InternalConfigurationLanguage.g:459:2: rule__ContentType__Group__5__Impl rule__ContentType__Group__6
            {
            pushFollow(FOLLOW_9);
            rule__ContentType__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ContentType__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ContentType__Group__5"


    // $ANTLR start "rule__ContentType__Group__5__Impl"
    // InternalConfigurationLanguage.g:466:1: rule__ContentType__Group__5__Impl : ( 'by' ) ;
    public final void rule__ContentType__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConfigurationLanguage.g:470:1: ( ( 'by' ) )
            // InternalConfigurationLanguage.g:471:1: ( 'by' )
            {
            // InternalConfigurationLanguage.g:471:1: ( 'by' )
            // InternalConfigurationLanguage.g:472:2: 'by'
            {
             before(grammarAccess.getContentTypeAccess().getByKeyword_5()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getContentTypeAccess().getByKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ContentType__Group__5__Impl"


    // $ANTLR start "rule__ContentType__Group__6"
    // InternalConfigurationLanguage.g:481:1: rule__ContentType__Group__6 : rule__ContentType__Group__6__Impl rule__ContentType__Group__7 ;
    public final void rule__ContentType__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConfigurationLanguage.g:485:1: ( rule__ContentType__Group__6__Impl rule__ContentType__Group__7 )
            // InternalConfigurationLanguage.g:486:2: rule__ContentType__Group__6__Impl rule__ContentType__Group__7
            {
            pushFollow(FOLLOW_10);
            rule__ContentType__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ContentType__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ContentType__Group__6"


    // $ANTLR start "rule__ContentType__Group__6__Impl"
    // InternalConfigurationLanguage.g:493:1: rule__ContentType__Group__6__Impl : ( ( rule__ContentType__SelectorAssignment_6 ) ) ;
    public final void rule__ContentType__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConfigurationLanguage.g:497:1: ( ( ( rule__ContentType__SelectorAssignment_6 ) ) )
            // InternalConfigurationLanguage.g:498:1: ( ( rule__ContentType__SelectorAssignment_6 ) )
            {
            // InternalConfigurationLanguage.g:498:1: ( ( rule__ContentType__SelectorAssignment_6 ) )
            // InternalConfigurationLanguage.g:499:2: ( rule__ContentType__SelectorAssignment_6 )
            {
             before(grammarAccess.getContentTypeAccess().getSelectorAssignment_6()); 
            // InternalConfigurationLanguage.g:500:2: ( rule__ContentType__SelectorAssignment_6 )
            // InternalConfigurationLanguage.g:500:3: rule__ContentType__SelectorAssignment_6
            {
            pushFollow(FOLLOW_2);
            rule__ContentType__SelectorAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getContentTypeAccess().getSelectorAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ContentType__Group__6__Impl"


    // $ANTLR start "rule__ContentType__Group__7"
    // InternalConfigurationLanguage.g:508:1: rule__ContentType__Group__7 : rule__ContentType__Group__7__Impl ;
    public final void rule__ContentType__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConfigurationLanguage.g:512:1: ( rule__ContentType__Group__7__Impl )
            // InternalConfigurationLanguage.g:513:2: rule__ContentType__Group__7__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ContentType__Group__7__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ContentType__Group__7"


    // $ANTLR start "rule__ContentType__Group__7__Impl"
    // InternalConfigurationLanguage.g:519:1: rule__ContentType__Group__7__Impl : ( ( rule__ContentType__Group_7__0 )? ) ;
    public final void rule__ContentType__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConfigurationLanguage.g:523:1: ( ( ( rule__ContentType__Group_7__0 )? ) )
            // InternalConfigurationLanguage.g:524:1: ( ( rule__ContentType__Group_7__0 )? )
            {
            // InternalConfigurationLanguage.g:524:1: ( ( rule__ContentType__Group_7__0 )? )
            // InternalConfigurationLanguage.g:525:2: ( rule__ContentType__Group_7__0 )?
            {
             before(grammarAccess.getContentTypeAccess().getGroup_7()); 
            // InternalConfigurationLanguage.g:526:2: ( rule__ContentType__Group_7__0 )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==16) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalConfigurationLanguage.g:526:3: rule__ContentType__Group_7__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ContentType__Group_7__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getContentTypeAccess().getGroup_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ContentType__Group__7__Impl"


    // $ANTLR start "rule__ContentType__Group_7__0"
    // InternalConfigurationLanguage.g:535:1: rule__ContentType__Group_7__0 : rule__ContentType__Group_7__0__Impl rule__ContentType__Group_7__1 ;
    public final void rule__ContentType__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConfigurationLanguage.g:539:1: ( rule__ContentType__Group_7__0__Impl rule__ContentType__Group_7__1 )
            // InternalConfigurationLanguage.g:540:2: rule__ContentType__Group_7__0__Impl rule__ContentType__Group_7__1
            {
            pushFollow(FOLLOW_5);
            rule__ContentType__Group_7__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ContentType__Group_7__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ContentType__Group_7__0"


    // $ANTLR start "rule__ContentType__Group_7__0__Impl"
    // InternalConfigurationLanguage.g:547:1: rule__ContentType__Group_7__0__Impl : ( 'recognize' ) ;
    public final void rule__ContentType__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConfigurationLanguage.g:551:1: ( ( 'recognize' ) )
            // InternalConfigurationLanguage.g:552:1: ( 'recognize' )
            {
            // InternalConfigurationLanguage.g:552:1: ( 'recognize' )
            // InternalConfigurationLanguage.g:553:2: 'recognize'
            {
             before(grammarAccess.getContentTypeAccess().getRecognizeKeyword_7_0()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getContentTypeAccess().getRecognizeKeyword_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ContentType__Group_7__0__Impl"


    // $ANTLR start "rule__ContentType__Group_7__1"
    // InternalConfigurationLanguage.g:562:1: rule__ContentType__Group_7__1 : rule__ContentType__Group_7__1__Impl ;
    public final void rule__ContentType__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConfigurationLanguage.g:566:1: ( rule__ContentType__Group_7__1__Impl )
            // InternalConfigurationLanguage.g:567:2: rule__ContentType__Group_7__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ContentType__Group_7__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ContentType__Group_7__1"


    // $ANTLR start "rule__ContentType__Group_7__1__Impl"
    // InternalConfigurationLanguage.g:573:1: rule__ContentType__Group_7__1__Impl : ( ( rule__ContentType__PropertiesAssignment_7_1 )* ) ;
    public final void rule__ContentType__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConfigurationLanguage.g:577:1: ( ( ( rule__ContentType__PropertiesAssignment_7_1 )* ) )
            // InternalConfigurationLanguage.g:578:1: ( ( rule__ContentType__PropertiesAssignment_7_1 )* )
            {
            // InternalConfigurationLanguage.g:578:1: ( ( rule__ContentType__PropertiesAssignment_7_1 )* )
            // InternalConfigurationLanguage.g:579:2: ( rule__ContentType__PropertiesAssignment_7_1 )*
            {
             before(grammarAccess.getContentTypeAccess().getPropertiesAssignment_7_1()); 
            // InternalConfigurationLanguage.g:580:2: ( rule__ContentType__PropertiesAssignment_7_1 )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==RULE_ID) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalConfigurationLanguage.g:580:3: rule__ContentType__PropertiesAssignment_7_1
            	    {
            	    pushFollow(FOLLOW_11);
            	    rule__ContentType__PropertiesAssignment_7_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

             after(grammarAccess.getContentTypeAccess().getPropertiesAssignment_7_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ContentType__Group_7__1__Impl"


    // $ANTLR start "rule__PageType__Group__0"
    // InternalConfigurationLanguage.g:589:1: rule__PageType__Group__0 : rule__PageType__Group__0__Impl rule__PageType__Group__1 ;
    public final void rule__PageType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConfigurationLanguage.g:593:1: ( rule__PageType__Group__0__Impl rule__PageType__Group__1 )
            // InternalConfigurationLanguage.g:594:2: rule__PageType__Group__0__Impl rule__PageType__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__PageType__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PageType__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PageType__Group__0"


    // $ANTLR start "rule__PageType__Group__0__Impl"
    // InternalConfigurationLanguage.g:601:1: rule__PageType__Group__0__Impl : ( 'page' ) ;
    public final void rule__PageType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConfigurationLanguage.g:605:1: ( ( 'page' ) )
            // InternalConfigurationLanguage.g:606:1: ( 'page' )
            {
            // InternalConfigurationLanguage.g:606:1: ( 'page' )
            // InternalConfigurationLanguage.g:607:2: 'page'
            {
             before(grammarAccess.getPageTypeAccess().getPageKeyword_0()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getPageTypeAccess().getPageKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PageType__Group__0__Impl"


    // $ANTLR start "rule__PageType__Group__1"
    // InternalConfigurationLanguage.g:616:1: rule__PageType__Group__1 : rule__PageType__Group__1__Impl rule__PageType__Group__2 ;
    public final void rule__PageType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConfigurationLanguage.g:620:1: ( rule__PageType__Group__1__Impl rule__PageType__Group__2 )
            // InternalConfigurationLanguage.g:621:2: rule__PageType__Group__1__Impl rule__PageType__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__PageType__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PageType__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PageType__Group__1"


    // $ANTLR start "rule__PageType__Group__1__Impl"
    // InternalConfigurationLanguage.g:628:1: rule__PageType__Group__1__Impl : ( 'type' ) ;
    public final void rule__PageType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConfigurationLanguage.g:632:1: ( ( 'type' ) )
            // InternalConfigurationLanguage.g:633:1: ( 'type' )
            {
            // InternalConfigurationLanguage.g:633:1: ( 'type' )
            // InternalConfigurationLanguage.g:634:2: 'type'
            {
             before(grammarAccess.getPageTypeAccess().getTypeKeyword_1()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getPageTypeAccess().getTypeKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PageType__Group__1__Impl"


    // $ANTLR start "rule__PageType__Group__2"
    // InternalConfigurationLanguage.g:643:1: rule__PageType__Group__2 : rule__PageType__Group__2__Impl rule__PageType__Group__3 ;
    public final void rule__PageType__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConfigurationLanguage.g:647:1: ( rule__PageType__Group__2__Impl rule__PageType__Group__3 )
            // InternalConfigurationLanguage.g:648:2: rule__PageType__Group__2__Impl rule__PageType__Group__3
            {
            pushFollow(FOLLOW_6);
            rule__PageType__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PageType__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PageType__Group__2"


    // $ANTLR start "rule__PageType__Group__2__Impl"
    // InternalConfigurationLanguage.g:655:1: rule__PageType__Group__2__Impl : ( ( rule__PageType__NameAssignment_2 ) ) ;
    public final void rule__PageType__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConfigurationLanguage.g:659:1: ( ( ( rule__PageType__NameAssignment_2 ) ) )
            // InternalConfigurationLanguage.g:660:1: ( ( rule__PageType__NameAssignment_2 ) )
            {
            // InternalConfigurationLanguage.g:660:1: ( ( rule__PageType__NameAssignment_2 ) )
            // InternalConfigurationLanguage.g:661:2: ( rule__PageType__NameAssignment_2 )
            {
             before(grammarAccess.getPageTypeAccess().getNameAssignment_2()); 
            // InternalConfigurationLanguage.g:662:2: ( rule__PageType__NameAssignment_2 )
            // InternalConfigurationLanguage.g:662:3: rule__PageType__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__PageType__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getPageTypeAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PageType__Group__2__Impl"


    // $ANTLR start "rule__PageType__Group__3"
    // InternalConfigurationLanguage.g:670:1: rule__PageType__Group__3 : rule__PageType__Group__3__Impl rule__PageType__Group__4 ;
    public final void rule__PageType__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConfigurationLanguage.g:674:1: ( rule__PageType__Group__3__Impl rule__PageType__Group__4 )
            // InternalConfigurationLanguage.g:675:2: rule__PageType__Group__3__Impl rule__PageType__Group__4
            {
            pushFollow(FOLLOW_7);
            rule__PageType__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PageType__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PageType__Group__3"


    // $ANTLR start "rule__PageType__Group__3__Impl"
    // InternalConfigurationLanguage.g:682:1: rule__PageType__Group__3__Impl : ( 'is' ) ;
    public final void rule__PageType__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConfigurationLanguage.g:686:1: ( ( 'is' ) )
            // InternalConfigurationLanguage.g:687:1: ( 'is' )
            {
            // InternalConfigurationLanguage.g:687:1: ( 'is' )
            // InternalConfigurationLanguage.g:688:2: 'is'
            {
             before(grammarAccess.getPageTypeAccess().getIsKeyword_3()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getPageTypeAccess().getIsKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PageType__Group__3__Impl"


    // $ANTLR start "rule__PageType__Group__4"
    // InternalConfigurationLanguage.g:697:1: rule__PageType__Group__4 : rule__PageType__Group__4__Impl rule__PageType__Group__5 ;
    public final void rule__PageType__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConfigurationLanguage.g:701:1: ( rule__PageType__Group__4__Impl rule__PageType__Group__5 )
            // InternalConfigurationLanguage.g:702:2: rule__PageType__Group__4__Impl rule__PageType__Group__5
            {
            pushFollow(FOLLOW_8);
            rule__PageType__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PageType__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PageType__Group__4"


    // $ANTLR start "rule__PageType__Group__4__Impl"
    // InternalConfigurationLanguage.g:709:1: rule__PageType__Group__4__Impl : ( 'recognized' ) ;
    public final void rule__PageType__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConfigurationLanguage.g:713:1: ( ( 'recognized' ) )
            // InternalConfigurationLanguage.g:714:1: ( 'recognized' )
            {
            // InternalConfigurationLanguage.g:714:1: ( 'recognized' )
            // InternalConfigurationLanguage.g:715:2: 'recognized'
            {
             before(grammarAccess.getPageTypeAccess().getRecognizedKeyword_4()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getPageTypeAccess().getRecognizedKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PageType__Group__4__Impl"


    // $ANTLR start "rule__PageType__Group__5"
    // InternalConfigurationLanguage.g:724:1: rule__PageType__Group__5 : rule__PageType__Group__5__Impl rule__PageType__Group__6 ;
    public final void rule__PageType__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConfigurationLanguage.g:728:1: ( rule__PageType__Group__5__Impl rule__PageType__Group__6 )
            // InternalConfigurationLanguage.g:729:2: rule__PageType__Group__5__Impl rule__PageType__Group__6
            {
            pushFollow(FOLLOW_12);
            rule__PageType__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PageType__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PageType__Group__5"


    // $ANTLR start "rule__PageType__Group__5__Impl"
    // InternalConfigurationLanguage.g:736:1: rule__PageType__Group__5__Impl : ( 'by' ) ;
    public final void rule__PageType__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConfigurationLanguage.g:740:1: ( ( 'by' ) )
            // InternalConfigurationLanguage.g:741:1: ( 'by' )
            {
            // InternalConfigurationLanguage.g:741:1: ( 'by' )
            // InternalConfigurationLanguage.g:742:2: 'by'
            {
             before(grammarAccess.getPageTypeAccess().getByKeyword_5()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getPageTypeAccess().getByKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PageType__Group__5__Impl"


    // $ANTLR start "rule__PageType__Group__6"
    // InternalConfigurationLanguage.g:751:1: rule__PageType__Group__6 : rule__PageType__Group__6__Impl rule__PageType__Group__7 ;
    public final void rule__PageType__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConfigurationLanguage.g:755:1: ( rule__PageType__Group__6__Impl rule__PageType__Group__7 )
            // InternalConfigurationLanguage.g:756:2: rule__PageType__Group__6__Impl rule__PageType__Group__7
            {
            pushFollow(FOLLOW_10);
            rule__PageType__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PageType__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PageType__Group__6"


    // $ANTLR start "rule__PageType__Group__6__Impl"
    // InternalConfigurationLanguage.g:763:1: rule__PageType__Group__6__Impl : ( ( rule__PageType__SelectorAssignment_6 ) ) ;
    public final void rule__PageType__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConfigurationLanguage.g:767:1: ( ( ( rule__PageType__SelectorAssignment_6 ) ) )
            // InternalConfigurationLanguage.g:768:1: ( ( rule__PageType__SelectorAssignment_6 ) )
            {
            // InternalConfigurationLanguage.g:768:1: ( ( rule__PageType__SelectorAssignment_6 ) )
            // InternalConfigurationLanguage.g:769:2: ( rule__PageType__SelectorAssignment_6 )
            {
             before(grammarAccess.getPageTypeAccess().getSelectorAssignment_6()); 
            // InternalConfigurationLanguage.g:770:2: ( rule__PageType__SelectorAssignment_6 )
            // InternalConfigurationLanguage.g:770:3: rule__PageType__SelectorAssignment_6
            {
            pushFollow(FOLLOW_2);
            rule__PageType__SelectorAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getPageTypeAccess().getSelectorAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PageType__Group__6__Impl"


    // $ANTLR start "rule__PageType__Group__7"
    // InternalConfigurationLanguage.g:778:1: rule__PageType__Group__7 : rule__PageType__Group__7__Impl ;
    public final void rule__PageType__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConfigurationLanguage.g:782:1: ( rule__PageType__Group__7__Impl )
            // InternalConfigurationLanguage.g:783:2: rule__PageType__Group__7__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PageType__Group__7__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PageType__Group__7"


    // $ANTLR start "rule__PageType__Group__7__Impl"
    // InternalConfigurationLanguage.g:789:1: rule__PageType__Group__7__Impl : ( ( rule__PageType__Group_7__0 )? ) ;
    public final void rule__PageType__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConfigurationLanguage.g:793:1: ( ( ( rule__PageType__Group_7__0 )? ) )
            // InternalConfigurationLanguage.g:794:1: ( ( rule__PageType__Group_7__0 )? )
            {
            // InternalConfigurationLanguage.g:794:1: ( ( rule__PageType__Group_7__0 )? )
            // InternalConfigurationLanguage.g:795:2: ( rule__PageType__Group_7__0 )?
            {
             before(grammarAccess.getPageTypeAccess().getGroup_7()); 
            // InternalConfigurationLanguage.g:796:2: ( rule__PageType__Group_7__0 )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==16) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalConfigurationLanguage.g:796:3: rule__PageType__Group_7__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__PageType__Group_7__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getPageTypeAccess().getGroup_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PageType__Group__7__Impl"


    // $ANTLR start "rule__PageType__Group_7__0"
    // InternalConfigurationLanguage.g:805:1: rule__PageType__Group_7__0 : rule__PageType__Group_7__0__Impl rule__PageType__Group_7__1 ;
    public final void rule__PageType__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConfigurationLanguage.g:809:1: ( rule__PageType__Group_7__0__Impl rule__PageType__Group_7__1 )
            // InternalConfigurationLanguage.g:810:2: rule__PageType__Group_7__0__Impl rule__PageType__Group_7__1
            {
            pushFollow(FOLLOW_5);
            rule__PageType__Group_7__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PageType__Group_7__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PageType__Group_7__0"


    // $ANTLR start "rule__PageType__Group_7__0__Impl"
    // InternalConfigurationLanguage.g:817:1: rule__PageType__Group_7__0__Impl : ( 'recognize' ) ;
    public final void rule__PageType__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConfigurationLanguage.g:821:1: ( ( 'recognize' ) )
            // InternalConfigurationLanguage.g:822:1: ( 'recognize' )
            {
            // InternalConfigurationLanguage.g:822:1: ( 'recognize' )
            // InternalConfigurationLanguage.g:823:2: 'recognize'
            {
             before(grammarAccess.getPageTypeAccess().getRecognizeKeyword_7_0()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getPageTypeAccess().getRecognizeKeyword_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PageType__Group_7__0__Impl"


    // $ANTLR start "rule__PageType__Group_7__1"
    // InternalConfigurationLanguage.g:832:1: rule__PageType__Group_7__1 : rule__PageType__Group_7__1__Impl ;
    public final void rule__PageType__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConfigurationLanguage.g:836:1: ( rule__PageType__Group_7__1__Impl )
            // InternalConfigurationLanguage.g:837:2: rule__PageType__Group_7__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PageType__Group_7__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PageType__Group_7__1"


    // $ANTLR start "rule__PageType__Group_7__1__Impl"
    // InternalConfigurationLanguage.g:843:1: rule__PageType__Group_7__1__Impl : ( ( rule__PageType__PropertiesAssignment_7_1 )* ) ;
    public final void rule__PageType__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConfigurationLanguage.g:847:1: ( ( ( rule__PageType__PropertiesAssignment_7_1 )* ) )
            // InternalConfigurationLanguage.g:848:1: ( ( rule__PageType__PropertiesAssignment_7_1 )* )
            {
            // InternalConfigurationLanguage.g:848:1: ( ( rule__PageType__PropertiesAssignment_7_1 )* )
            // InternalConfigurationLanguage.g:849:2: ( rule__PageType__PropertiesAssignment_7_1 )*
            {
             before(grammarAccess.getPageTypeAccess().getPropertiesAssignment_7_1()); 
            // InternalConfigurationLanguage.g:850:2: ( rule__PageType__PropertiesAssignment_7_1 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==RULE_ID) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalConfigurationLanguage.g:850:3: rule__PageType__PropertiesAssignment_7_1
            	    {
            	    pushFollow(FOLLOW_11);
            	    rule__PageType__PropertiesAssignment_7_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

             after(grammarAccess.getPageTypeAccess().getPropertiesAssignment_7_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PageType__Group_7__1__Impl"


    // $ANTLR start "rule__CssSelector__Group__0"
    // InternalConfigurationLanguage.g:859:1: rule__CssSelector__Group__0 : rule__CssSelector__Group__0__Impl rule__CssSelector__Group__1 ;
    public final void rule__CssSelector__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConfigurationLanguage.g:863:1: ( rule__CssSelector__Group__0__Impl rule__CssSelector__Group__1 )
            // InternalConfigurationLanguage.g:864:2: rule__CssSelector__Group__0__Impl rule__CssSelector__Group__1
            {
            pushFollow(FOLLOW_13);
            rule__CssSelector__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CssSelector__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CssSelector__Group__0"


    // $ANTLR start "rule__CssSelector__Group__0__Impl"
    // InternalConfigurationLanguage.g:871:1: rule__CssSelector__Group__0__Impl : ( 'css' ) ;
    public final void rule__CssSelector__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConfigurationLanguage.g:875:1: ( ( 'css' ) )
            // InternalConfigurationLanguage.g:876:1: ( 'css' )
            {
            // InternalConfigurationLanguage.g:876:1: ( 'css' )
            // InternalConfigurationLanguage.g:877:2: 'css'
            {
             before(grammarAccess.getCssSelectorAccess().getCssKeyword_0()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getCssSelectorAccess().getCssKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CssSelector__Group__0__Impl"


    // $ANTLR start "rule__CssSelector__Group__1"
    // InternalConfigurationLanguage.g:886:1: rule__CssSelector__Group__1 : rule__CssSelector__Group__1__Impl ;
    public final void rule__CssSelector__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConfigurationLanguage.g:890:1: ( rule__CssSelector__Group__1__Impl )
            // InternalConfigurationLanguage.g:891:2: rule__CssSelector__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CssSelector__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CssSelector__Group__1"


    // $ANTLR start "rule__CssSelector__Group__1__Impl"
    // InternalConfigurationLanguage.g:897:1: rule__CssSelector__Group__1__Impl : ( ( rule__CssSelector__DefinitionAssignment_1 ) ) ;
    public final void rule__CssSelector__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConfigurationLanguage.g:901:1: ( ( ( rule__CssSelector__DefinitionAssignment_1 ) ) )
            // InternalConfigurationLanguage.g:902:1: ( ( rule__CssSelector__DefinitionAssignment_1 ) )
            {
            // InternalConfigurationLanguage.g:902:1: ( ( rule__CssSelector__DefinitionAssignment_1 ) )
            // InternalConfigurationLanguage.g:903:2: ( rule__CssSelector__DefinitionAssignment_1 )
            {
             before(grammarAccess.getCssSelectorAccess().getDefinitionAssignment_1()); 
            // InternalConfigurationLanguage.g:904:2: ( rule__CssSelector__DefinitionAssignment_1 )
            // InternalConfigurationLanguage.g:904:3: rule__CssSelector__DefinitionAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__CssSelector__DefinitionAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getCssSelectorAccess().getDefinitionAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CssSelector__Group__1__Impl"


    // $ANTLR start "rule__UrlPatternSelector__Group__0"
    // InternalConfigurationLanguage.g:913:1: rule__UrlPatternSelector__Group__0 : rule__UrlPatternSelector__Group__0__Impl rule__UrlPatternSelector__Group__1 ;
    public final void rule__UrlPatternSelector__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConfigurationLanguage.g:917:1: ( rule__UrlPatternSelector__Group__0__Impl rule__UrlPatternSelector__Group__1 )
            // InternalConfigurationLanguage.g:918:2: rule__UrlPatternSelector__Group__0__Impl rule__UrlPatternSelector__Group__1
            {
            pushFollow(FOLLOW_14);
            rule__UrlPatternSelector__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__UrlPatternSelector__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UrlPatternSelector__Group__0"


    // $ANTLR start "rule__UrlPatternSelector__Group__0__Impl"
    // InternalConfigurationLanguage.g:925:1: rule__UrlPatternSelector__Group__0__Impl : ( 'url' ) ;
    public final void rule__UrlPatternSelector__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConfigurationLanguage.g:929:1: ( ( 'url' ) )
            // InternalConfigurationLanguage.g:930:1: ( 'url' )
            {
            // InternalConfigurationLanguage.g:930:1: ( 'url' )
            // InternalConfigurationLanguage.g:931:2: 'url'
            {
             before(grammarAccess.getUrlPatternSelectorAccess().getUrlKeyword_0()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getUrlPatternSelectorAccess().getUrlKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UrlPatternSelector__Group__0__Impl"


    // $ANTLR start "rule__UrlPatternSelector__Group__1"
    // InternalConfigurationLanguage.g:940:1: rule__UrlPatternSelector__Group__1 : rule__UrlPatternSelector__Group__1__Impl rule__UrlPatternSelector__Group__2 ;
    public final void rule__UrlPatternSelector__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConfigurationLanguage.g:944:1: ( rule__UrlPatternSelector__Group__1__Impl rule__UrlPatternSelector__Group__2 )
            // InternalConfigurationLanguage.g:945:2: rule__UrlPatternSelector__Group__1__Impl rule__UrlPatternSelector__Group__2
            {
            pushFollow(FOLLOW_13);
            rule__UrlPatternSelector__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__UrlPatternSelector__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UrlPatternSelector__Group__1"


    // $ANTLR start "rule__UrlPatternSelector__Group__1__Impl"
    // InternalConfigurationLanguage.g:952:1: rule__UrlPatternSelector__Group__1__Impl : ( 'pattern' ) ;
    public final void rule__UrlPatternSelector__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConfigurationLanguage.g:956:1: ( ( 'pattern' ) )
            // InternalConfigurationLanguage.g:957:1: ( 'pattern' )
            {
            // InternalConfigurationLanguage.g:957:1: ( 'pattern' )
            // InternalConfigurationLanguage.g:958:2: 'pattern'
            {
             before(grammarAccess.getUrlPatternSelectorAccess().getPatternKeyword_1()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getUrlPatternSelectorAccess().getPatternKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UrlPatternSelector__Group__1__Impl"


    // $ANTLR start "rule__UrlPatternSelector__Group__2"
    // InternalConfigurationLanguage.g:967:1: rule__UrlPatternSelector__Group__2 : rule__UrlPatternSelector__Group__2__Impl ;
    public final void rule__UrlPatternSelector__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConfigurationLanguage.g:971:1: ( rule__UrlPatternSelector__Group__2__Impl )
            // InternalConfigurationLanguage.g:972:2: rule__UrlPatternSelector__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__UrlPatternSelector__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UrlPatternSelector__Group__2"


    // $ANTLR start "rule__UrlPatternSelector__Group__2__Impl"
    // InternalConfigurationLanguage.g:978:1: rule__UrlPatternSelector__Group__2__Impl : ( ( rule__UrlPatternSelector__DefinitionAssignment_2 ) ) ;
    public final void rule__UrlPatternSelector__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConfigurationLanguage.g:982:1: ( ( ( rule__UrlPatternSelector__DefinitionAssignment_2 ) ) )
            // InternalConfigurationLanguage.g:983:1: ( ( rule__UrlPatternSelector__DefinitionAssignment_2 ) )
            {
            // InternalConfigurationLanguage.g:983:1: ( ( rule__UrlPatternSelector__DefinitionAssignment_2 ) )
            // InternalConfigurationLanguage.g:984:2: ( rule__UrlPatternSelector__DefinitionAssignment_2 )
            {
             before(grammarAccess.getUrlPatternSelectorAccess().getDefinitionAssignment_2()); 
            // InternalConfigurationLanguage.g:985:2: ( rule__UrlPatternSelector__DefinitionAssignment_2 )
            // InternalConfigurationLanguage.g:985:3: rule__UrlPatternSelector__DefinitionAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__UrlPatternSelector__DefinitionAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getUrlPatternSelectorAccess().getDefinitionAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UrlPatternSelector__Group__2__Impl"


    // $ANTLR start "rule__Property__Group__0"
    // InternalConfigurationLanguage.g:994:1: rule__Property__Group__0 : rule__Property__Group__0__Impl rule__Property__Group__1 ;
    public final void rule__Property__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConfigurationLanguage.g:998:1: ( rule__Property__Group__0__Impl rule__Property__Group__1 )
            // InternalConfigurationLanguage.g:999:2: rule__Property__Group__0__Impl rule__Property__Group__1
            {
            pushFollow(FOLLOW_15);
            rule__Property__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Property__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Property__Group__0"


    // $ANTLR start "rule__Property__Group__0__Impl"
    // InternalConfigurationLanguage.g:1006:1: rule__Property__Group__0__Impl : ( ( rule__Property__NameAssignment_0 ) ) ;
    public final void rule__Property__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConfigurationLanguage.g:1010:1: ( ( ( rule__Property__NameAssignment_0 ) ) )
            // InternalConfigurationLanguage.g:1011:1: ( ( rule__Property__NameAssignment_0 ) )
            {
            // InternalConfigurationLanguage.g:1011:1: ( ( rule__Property__NameAssignment_0 ) )
            // InternalConfigurationLanguage.g:1012:2: ( rule__Property__NameAssignment_0 )
            {
             before(grammarAccess.getPropertyAccess().getNameAssignment_0()); 
            // InternalConfigurationLanguage.g:1013:2: ( rule__Property__NameAssignment_0 )
            // InternalConfigurationLanguage.g:1013:3: rule__Property__NameAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Property__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getPropertyAccess().getNameAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Property__Group__0__Impl"


    // $ANTLR start "rule__Property__Group__1"
    // InternalConfigurationLanguage.g:1021:1: rule__Property__Group__1 : rule__Property__Group__1__Impl rule__Property__Group__2 ;
    public final void rule__Property__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConfigurationLanguage.g:1025:1: ( rule__Property__Group__1__Impl rule__Property__Group__2 )
            // InternalConfigurationLanguage.g:1026:2: rule__Property__Group__1__Impl rule__Property__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__Property__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Property__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Property__Group__1"


    // $ANTLR start "rule__Property__Group__1__Impl"
    // InternalConfigurationLanguage.g:1033:1: rule__Property__Group__1__Impl : ( 'as' ) ;
    public final void rule__Property__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConfigurationLanguage.g:1037:1: ( ( 'as' ) )
            // InternalConfigurationLanguage.g:1038:1: ( 'as' )
            {
            // InternalConfigurationLanguage.g:1038:1: ( 'as' )
            // InternalConfigurationLanguage.g:1039:2: 'as'
            {
             before(grammarAccess.getPropertyAccess().getAsKeyword_1()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getPropertyAccess().getAsKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Property__Group__1__Impl"


    // $ANTLR start "rule__Property__Group__2"
    // InternalConfigurationLanguage.g:1048:1: rule__Property__Group__2 : rule__Property__Group__2__Impl rule__Property__Group__3 ;
    public final void rule__Property__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConfigurationLanguage.g:1052:1: ( rule__Property__Group__2__Impl rule__Property__Group__3 )
            // InternalConfigurationLanguage.g:1053:2: rule__Property__Group__2__Impl rule__Property__Group__3
            {
            pushFollow(FOLLOW_8);
            rule__Property__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Property__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Property__Group__2"


    // $ANTLR start "rule__Property__Group__2__Impl"
    // InternalConfigurationLanguage.g:1060:1: rule__Property__Group__2__Impl : ( ( rule__Property__TypeAssignment_2 ) ) ;
    public final void rule__Property__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConfigurationLanguage.g:1064:1: ( ( ( rule__Property__TypeAssignment_2 ) ) )
            // InternalConfigurationLanguage.g:1065:1: ( ( rule__Property__TypeAssignment_2 ) )
            {
            // InternalConfigurationLanguage.g:1065:1: ( ( rule__Property__TypeAssignment_2 ) )
            // InternalConfigurationLanguage.g:1066:2: ( rule__Property__TypeAssignment_2 )
            {
             before(grammarAccess.getPropertyAccess().getTypeAssignment_2()); 
            // InternalConfigurationLanguage.g:1067:2: ( rule__Property__TypeAssignment_2 )
            // InternalConfigurationLanguage.g:1067:3: rule__Property__TypeAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Property__TypeAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getPropertyAccess().getTypeAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Property__Group__2__Impl"


    // $ANTLR start "rule__Property__Group__3"
    // InternalConfigurationLanguage.g:1075:1: rule__Property__Group__3 : rule__Property__Group__3__Impl ;
    public final void rule__Property__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConfigurationLanguage.g:1079:1: ( rule__Property__Group__3__Impl )
            // InternalConfigurationLanguage.g:1080:2: rule__Property__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Property__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Property__Group__3"


    // $ANTLR start "rule__Property__Group__3__Impl"
    // InternalConfigurationLanguage.g:1086:1: rule__Property__Group__3__Impl : ( ( rule__Property__Group_3__0 )? ) ;
    public final void rule__Property__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConfigurationLanguage.g:1090:1: ( ( ( rule__Property__Group_3__0 )? ) )
            // InternalConfigurationLanguage.g:1091:1: ( ( rule__Property__Group_3__0 )? )
            {
            // InternalConfigurationLanguage.g:1091:1: ( ( rule__Property__Group_3__0 )? )
            // InternalConfigurationLanguage.g:1092:2: ( rule__Property__Group_3__0 )?
            {
             before(grammarAccess.getPropertyAccess().getGroup_3()); 
            // InternalConfigurationLanguage.g:1093:2: ( rule__Property__Group_3__0 )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==15) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalConfigurationLanguage.g:1093:3: rule__Property__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Property__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getPropertyAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Property__Group__3__Impl"


    // $ANTLR start "rule__Property__Group_3__0"
    // InternalConfigurationLanguage.g:1102:1: rule__Property__Group_3__0 : rule__Property__Group_3__0__Impl rule__Property__Group_3__1 ;
    public final void rule__Property__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConfigurationLanguage.g:1106:1: ( rule__Property__Group_3__0__Impl rule__Property__Group_3__1 )
            // InternalConfigurationLanguage.g:1107:2: rule__Property__Group_3__0__Impl rule__Property__Group_3__1
            {
            pushFollow(FOLLOW_9);
            rule__Property__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Property__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Property__Group_3__0"


    // $ANTLR start "rule__Property__Group_3__0__Impl"
    // InternalConfigurationLanguage.g:1114:1: rule__Property__Group_3__0__Impl : ( 'by' ) ;
    public final void rule__Property__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConfigurationLanguage.g:1118:1: ( ( 'by' ) )
            // InternalConfigurationLanguage.g:1119:1: ( 'by' )
            {
            // InternalConfigurationLanguage.g:1119:1: ( 'by' )
            // InternalConfigurationLanguage.g:1120:2: 'by'
            {
             before(grammarAccess.getPropertyAccess().getByKeyword_3_0()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getPropertyAccess().getByKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Property__Group_3__0__Impl"


    // $ANTLR start "rule__Property__Group_3__1"
    // InternalConfigurationLanguage.g:1129:1: rule__Property__Group_3__1 : rule__Property__Group_3__1__Impl ;
    public final void rule__Property__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConfigurationLanguage.g:1133:1: ( rule__Property__Group_3__1__Impl )
            // InternalConfigurationLanguage.g:1134:2: rule__Property__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Property__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Property__Group_3__1"


    // $ANTLR start "rule__Property__Group_3__1__Impl"
    // InternalConfigurationLanguage.g:1140:1: rule__Property__Group_3__1__Impl : ( ( rule__Property__SelectorAssignment_3_1 ) ) ;
    public final void rule__Property__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConfigurationLanguage.g:1144:1: ( ( ( rule__Property__SelectorAssignment_3_1 ) ) )
            // InternalConfigurationLanguage.g:1145:1: ( ( rule__Property__SelectorAssignment_3_1 ) )
            {
            // InternalConfigurationLanguage.g:1145:1: ( ( rule__Property__SelectorAssignment_3_1 ) )
            // InternalConfigurationLanguage.g:1146:2: ( rule__Property__SelectorAssignment_3_1 )
            {
             before(grammarAccess.getPropertyAccess().getSelectorAssignment_3_1()); 
            // InternalConfigurationLanguage.g:1147:2: ( rule__Property__SelectorAssignment_3_1 )
            // InternalConfigurationLanguage.g:1147:3: rule__Property__SelectorAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Property__SelectorAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getPropertyAccess().getSelectorAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Property__Group_3__1__Impl"


    // $ANTLR start "rule__SiteStructure__TypeDefinitionsAssignment"
    // InternalConfigurationLanguage.g:1156:1: rule__SiteStructure__TypeDefinitionsAssignment : ( ruleType ) ;
    public final void rule__SiteStructure__TypeDefinitionsAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConfigurationLanguage.g:1160:1: ( ( ruleType ) )
            // InternalConfigurationLanguage.g:1161:2: ( ruleType )
            {
            // InternalConfigurationLanguage.g:1161:2: ( ruleType )
            // InternalConfigurationLanguage.g:1162:3: ruleType
            {
             before(grammarAccess.getSiteStructureAccess().getTypeDefinitionsTypeParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleType();

            state._fsp--;

             after(grammarAccess.getSiteStructureAccess().getTypeDefinitionsTypeParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SiteStructure__TypeDefinitionsAssignment"


    // $ANTLR start "rule__ContentType__NameAssignment_2"
    // InternalConfigurationLanguage.g:1171:1: rule__ContentType__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__ContentType__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConfigurationLanguage.g:1175:1: ( ( RULE_ID ) )
            // InternalConfigurationLanguage.g:1176:2: ( RULE_ID )
            {
            // InternalConfigurationLanguage.g:1176:2: ( RULE_ID )
            // InternalConfigurationLanguage.g:1177:3: RULE_ID
            {
             before(grammarAccess.getContentTypeAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getContentTypeAccess().getNameIDTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ContentType__NameAssignment_2"


    // $ANTLR start "rule__ContentType__SelectorAssignment_6"
    // InternalConfigurationLanguage.g:1186:1: rule__ContentType__SelectorAssignment_6 : ( ruleContentSelector ) ;
    public final void rule__ContentType__SelectorAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConfigurationLanguage.g:1190:1: ( ( ruleContentSelector ) )
            // InternalConfigurationLanguage.g:1191:2: ( ruleContentSelector )
            {
            // InternalConfigurationLanguage.g:1191:2: ( ruleContentSelector )
            // InternalConfigurationLanguage.g:1192:3: ruleContentSelector
            {
             before(grammarAccess.getContentTypeAccess().getSelectorContentSelectorParserRuleCall_6_0()); 
            pushFollow(FOLLOW_2);
            ruleContentSelector();

            state._fsp--;

             after(grammarAccess.getContentTypeAccess().getSelectorContentSelectorParserRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ContentType__SelectorAssignment_6"


    // $ANTLR start "rule__ContentType__PropertiesAssignment_7_1"
    // InternalConfigurationLanguage.g:1201:1: rule__ContentType__PropertiesAssignment_7_1 : ( ruleProperty ) ;
    public final void rule__ContentType__PropertiesAssignment_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConfigurationLanguage.g:1205:1: ( ( ruleProperty ) )
            // InternalConfigurationLanguage.g:1206:2: ( ruleProperty )
            {
            // InternalConfigurationLanguage.g:1206:2: ( ruleProperty )
            // InternalConfigurationLanguage.g:1207:3: ruleProperty
            {
             before(grammarAccess.getContentTypeAccess().getPropertiesPropertyParserRuleCall_7_1_0()); 
            pushFollow(FOLLOW_2);
            ruleProperty();

            state._fsp--;

             after(grammarAccess.getContentTypeAccess().getPropertiesPropertyParserRuleCall_7_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ContentType__PropertiesAssignment_7_1"


    // $ANTLR start "rule__PageType__NameAssignment_2"
    // InternalConfigurationLanguage.g:1216:1: rule__PageType__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__PageType__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConfigurationLanguage.g:1220:1: ( ( RULE_ID ) )
            // InternalConfigurationLanguage.g:1221:2: ( RULE_ID )
            {
            // InternalConfigurationLanguage.g:1221:2: ( RULE_ID )
            // InternalConfigurationLanguage.g:1222:3: RULE_ID
            {
             before(grammarAccess.getPageTypeAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getPageTypeAccess().getNameIDTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PageType__NameAssignment_2"


    // $ANTLR start "rule__PageType__SelectorAssignment_6"
    // InternalConfigurationLanguage.g:1231:1: rule__PageType__SelectorAssignment_6 : ( rulePageSelector ) ;
    public final void rule__PageType__SelectorAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConfigurationLanguage.g:1235:1: ( ( rulePageSelector ) )
            // InternalConfigurationLanguage.g:1236:2: ( rulePageSelector )
            {
            // InternalConfigurationLanguage.g:1236:2: ( rulePageSelector )
            // InternalConfigurationLanguage.g:1237:3: rulePageSelector
            {
             before(grammarAccess.getPageTypeAccess().getSelectorPageSelectorParserRuleCall_6_0()); 
            pushFollow(FOLLOW_2);
            rulePageSelector();

            state._fsp--;

             after(grammarAccess.getPageTypeAccess().getSelectorPageSelectorParserRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PageType__SelectorAssignment_6"


    // $ANTLR start "rule__PageType__PropertiesAssignment_7_1"
    // InternalConfigurationLanguage.g:1246:1: rule__PageType__PropertiesAssignment_7_1 : ( ruleProperty ) ;
    public final void rule__PageType__PropertiesAssignment_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConfigurationLanguage.g:1250:1: ( ( ruleProperty ) )
            // InternalConfigurationLanguage.g:1251:2: ( ruleProperty )
            {
            // InternalConfigurationLanguage.g:1251:2: ( ruleProperty )
            // InternalConfigurationLanguage.g:1252:3: ruleProperty
            {
             before(grammarAccess.getPageTypeAccess().getPropertiesPropertyParserRuleCall_7_1_0()); 
            pushFollow(FOLLOW_2);
            ruleProperty();

            state._fsp--;

             after(grammarAccess.getPageTypeAccess().getPropertiesPropertyParserRuleCall_7_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PageType__PropertiesAssignment_7_1"


    // $ANTLR start "rule__CssSelector__DefinitionAssignment_1"
    // InternalConfigurationLanguage.g:1261:1: rule__CssSelector__DefinitionAssignment_1 : ( RULE_STRING ) ;
    public final void rule__CssSelector__DefinitionAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConfigurationLanguage.g:1265:1: ( ( RULE_STRING ) )
            // InternalConfigurationLanguage.g:1266:2: ( RULE_STRING )
            {
            // InternalConfigurationLanguage.g:1266:2: ( RULE_STRING )
            // InternalConfigurationLanguage.g:1267:3: RULE_STRING
            {
             before(grammarAccess.getCssSelectorAccess().getDefinitionSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getCssSelectorAccess().getDefinitionSTRINGTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CssSelector__DefinitionAssignment_1"


    // $ANTLR start "rule__UrlPatternSelector__DefinitionAssignment_2"
    // InternalConfigurationLanguage.g:1276:1: rule__UrlPatternSelector__DefinitionAssignment_2 : ( RULE_STRING ) ;
    public final void rule__UrlPatternSelector__DefinitionAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConfigurationLanguage.g:1280:1: ( ( RULE_STRING ) )
            // InternalConfigurationLanguage.g:1281:2: ( RULE_STRING )
            {
            // InternalConfigurationLanguage.g:1281:2: ( RULE_STRING )
            // InternalConfigurationLanguage.g:1282:3: RULE_STRING
            {
             before(grammarAccess.getUrlPatternSelectorAccess().getDefinitionSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getUrlPatternSelectorAccess().getDefinitionSTRINGTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UrlPatternSelector__DefinitionAssignment_2"


    // $ANTLR start "rule__Property__NameAssignment_0"
    // InternalConfigurationLanguage.g:1291:1: rule__Property__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__Property__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConfigurationLanguage.g:1295:1: ( ( RULE_ID ) )
            // InternalConfigurationLanguage.g:1296:2: ( RULE_ID )
            {
            // InternalConfigurationLanguage.g:1296:2: ( RULE_ID )
            // InternalConfigurationLanguage.g:1297:3: RULE_ID
            {
             before(grammarAccess.getPropertyAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getPropertyAccess().getNameIDTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Property__NameAssignment_0"


    // $ANTLR start "rule__Property__TypeAssignment_2"
    // InternalConfigurationLanguage.g:1306:1: rule__Property__TypeAssignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__Property__TypeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConfigurationLanguage.g:1310:1: ( ( ( RULE_ID ) ) )
            // InternalConfigurationLanguage.g:1311:2: ( ( RULE_ID ) )
            {
            // InternalConfigurationLanguage.g:1311:2: ( ( RULE_ID ) )
            // InternalConfigurationLanguage.g:1312:3: ( RULE_ID )
            {
             before(grammarAccess.getPropertyAccess().getTypeContentTypeCrossReference_2_0()); 
            // InternalConfigurationLanguage.g:1313:3: ( RULE_ID )
            // InternalConfigurationLanguage.g:1314:4: RULE_ID
            {
             before(grammarAccess.getPropertyAccess().getTypeContentTypeIDTerminalRuleCall_2_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getPropertyAccess().getTypeContentTypeIDTerminalRuleCall_2_0_1()); 

            }

             after(grammarAccess.getPropertyAccess().getTypeContentTypeCrossReference_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Property__TypeAssignment_2"


    // $ANTLR start "rule__Property__SelectorAssignment_3_1"
    // InternalConfigurationLanguage.g:1325:1: rule__Property__SelectorAssignment_3_1 : ( ruleContentSelector ) ;
    public final void rule__Property__SelectorAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConfigurationLanguage.g:1329:1: ( ( ruleContentSelector ) )
            // InternalConfigurationLanguage.g:1330:2: ( ruleContentSelector )
            {
            // InternalConfigurationLanguage.g:1330:2: ( ruleContentSelector )
            // InternalConfigurationLanguage.g:1331:3: ruleContentSelector
            {
             before(grammarAccess.getPropertyAccess().getSelectorContentSelectorParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleContentSelector();

            state._fsp--;

             after(grammarAccess.getPropertyAccess().getSelectorContentSelectorParserRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Property__SelectorAssignment_3_1"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000020802L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x00000000000C0000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000200000L});

}