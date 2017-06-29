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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'content'", "'type'", "'is'", "'recognized'", "'by'", "'recognize'", "'reference'", "'page'", "'css'", "'url'", "'pattern'", "'as'"
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
    public static final int T__22=22;
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

                if ( (LA1_0==11||(LA1_0>=17 && LA1_0<=18)) ) {
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


    // $ANTLR start "entryRuleReferenceType"
    // InternalConfigurationLanguage.g:128:1: entryRuleReferenceType : ruleReferenceType EOF ;
    public final void entryRuleReferenceType() throws RecognitionException {
        try {
            // InternalConfigurationLanguage.g:129:1: ( ruleReferenceType EOF )
            // InternalConfigurationLanguage.g:130:1: ruleReferenceType EOF
            {
             before(grammarAccess.getReferenceTypeRule()); 
            pushFollow(FOLLOW_1);
            ruleReferenceType();

            state._fsp--;

             after(grammarAccess.getReferenceTypeRule()); 
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
    // $ANTLR end "entryRuleReferenceType"


    // $ANTLR start "ruleReferenceType"
    // InternalConfigurationLanguage.g:137:1: ruleReferenceType : ( ( rule__ReferenceType__Group__0 ) ) ;
    public final void ruleReferenceType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConfigurationLanguage.g:141:2: ( ( ( rule__ReferenceType__Group__0 ) ) )
            // InternalConfigurationLanguage.g:142:2: ( ( rule__ReferenceType__Group__0 ) )
            {
            // InternalConfigurationLanguage.g:142:2: ( ( rule__ReferenceType__Group__0 ) )
            // InternalConfigurationLanguage.g:143:3: ( rule__ReferenceType__Group__0 )
            {
             before(grammarAccess.getReferenceTypeAccess().getGroup()); 
            // InternalConfigurationLanguage.g:144:3: ( rule__ReferenceType__Group__0 )
            // InternalConfigurationLanguage.g:144:4: rule__ReferenceType__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ReferenceType__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getReferenceTypeAccess().getGroup()); 

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
    // $ANTLR end "ruleReferenceType"


    // $ANTLR start "entryRulePageType"
    // InternalConfigurationLanguage.g:153:1: entryRulePageType : rulePageType EOF ;
    public final void entryRulePageType() throws RecognitionException {
        try {
            // InternalConfigurationLanguage.g:154:1: ( rulePageType EOF )
            // InternalConfigurationLanguage.g:155:1: rulePageType EOF
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
    // InternalConfigurationLanguage.g:162:1: rulePageType : ( ( rule__PageType__Group__0 ) ) ;
    public final void rulePageType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConfigurationLanguage.g:166:2: ( ( ( rule__PageType__Group__0 ) ) )
            // InternalConfigurationLanguage.g:167:2: ( ( rule__PageType__Group__0 ) )
            {
            // InternalConfigurationLanguage.g:167:2: ( ( rule__PageType__Group__0 ) )
            // InternalConfigurationLanguage.g:168:3: ( rule__PageType__Group__0 )
            {
             before(grammarAccess.getPageTypeAccess().getGroup()); 
            // InternalConfigurationLanguage.g:169:3: ( rule__PageType__Group__0 )
            // InternalConfigurationLanguage.g:169:4: rule__PageType__Group__0
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
    // InternalConfigurationLanguage.g:178:1: entryRuleContentSelector : ruleContentSelector EOF ;
    public final void entryRuleContentSelector() throws RecognitionException {
        try {
            // InternalConfigurationLanguage.g:179:1: ( ruleContentSelector EOF )
            // InternalConfigurationLanguage.g:180:1: ruleContentSelector EOF
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
    // InternalConfigurationLanguage.g:187:1: ruleContentSelector : ( ruleCssSelector ) ;
    public final void ruleContentSelector() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConfigurationLanguage.g:191:2: ( ( ruleCssSelector ) )
            // InternalConfigurationLanguage.g:192:2: ( ruleCssSelector )
            {
            // InternalConfigurationLanguage.g:192:2: ( ruleCssSelector )
            // InternalConfigurationLanguage.g:193:3: ruleCssSelector
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
    // InternalConfigurationLanguage.g:203:1: entryRulePageSelector : rulePageSelector EOF ;
    public final void entryRulePageSelector() throws RecognitionException {
        try {
            // InternalConfigurationLanguage.g:204:1: ( rulePageSelector EOF )
            // InternalConfigurationLanguage.g:205:1: rulePageSelector EOF
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
    // InternalConfigurationLanguage.g:212:1: rulePageSelector : ( ( rule__PageSelector__Alternatives ) ) ;
    public final void rulePageSelector() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConfigurationLanguage.g:216:2: ( ( ( rule__PageSelector__Alternatives ) ) )
            // InternalConfigurationLanguage.g:217:2: ( ( rule__PageSelector__Alternatives ) )
            {
            // InternalConfigurationLanguage.g:217:2: ( ( rule__PageSelector__Alternatives ) )
            // InternalConfigurationLanguage.g:218:3: ( rule__PageSelector__Alternatives )
            {
             before(grammarAccess.getPageSelectorAccess().getAlternatives()); 
            // InternalConfigurationLanguage.g:219:3: ( rule__PageSelector__Alternatives )
            // InternalConfigurationLanguage.g:219:4: rule__PageSelector__Alternatives
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
    // InternalConfigurationLanguage.g:228:1: entryRuleCssSelector : ruleCssSelector EOF ;
    public final void entryRuleCssSelector() throws RecognitionException {
        try {
            // InternalConfigurationLanguage.g:229:1: ( ruleCssSelector EOF )
            // InternalConfigurationLanguage.g:230:1: ruleCssSelector EOF
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
    // InternalConfigurationLanguage.g:237:1: ruleCssSelector : ( ( rule__CssSelector__Group__0 ) ) ;
    public final void ruleCssSelector() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConfigurationLanguage.g:241:2: ( ( ( rule__CssSelector__Group__0 ) ) )
            // InternalConfigurationLanguage.g:242:2: ( ( rule__CssSelector__Group__0 ) )
            {
            // InternalConfigurationLanguage.g:242:2: ( ( rule__CssSelector__Group__0 ) )
            // InternalConfigurationLanguage.g:243:3: ( rule__CssSelector__Group__0 )
            {
             before(grammarAccess.getCssSelectorAccess().getGroup()); 
            // InternalConfigurationLanguage.g:244:3: ( rule__CssSelector__Group__0 )
            // InternalConfigurationLanguage.g:244:4: rule__CssSelector__Group__0
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
    // InternalConfigurationLanguage.g:253:1: entryRuleUrlPatternSelector : ruleUrlPatternSelector EOF ;
    public final void entryRuleUrlPatternSelector() throws RecognitionException {
        try {
            // InternalConfigurationLanguage.g:254:1: ( ruleUrlPatternSelector EOF )
            // InternalConfigurationLanguage.g:255:1: ruleUrlPatternSelector EOF
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
    // InternalConfigurationLanguage.g:262:1: ruleUrlPatternSelector : ( ( rule__UrlPatternSelector__Group__0 ) ) ;
    public final void ruleUrlPatternSelector() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConfigurationLanguage.g:266:2: ( ( ( rule__UrlPatternSelector__Group__0 ) ) )
            // InternalConfigurationLanguage.g:267:2: ( ( rule__UrlPatternSelector__Group__0 ) )
            {
            // InternalConfigurationLanguage.g:267:2: ( ( rule__UrlPatternSelector__Group__0 ) )
            // InternalConfigurationLanguage.g:268:3: ( rule__UrlPatternSelector__Group__0 )
            {
             before(grammarAccess.getUrlPatternSelectorAccess().getGroup()); 
            // InternalConfigurationLanguage.g:269:3: ( rule__UrlPatternSelector__Group__0 )
            // InternalConfigurationLanguage.g:269:4: rule__UrlPatternSelector__Group__0
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
    // InternalConfigurationLanguage.g:278:1: entryRuleProperty : ruleProperty EOF ;
    public final void entryRuleProperty() throws RecognitionException {
        try {
            // InternalConfigurationLanguage.g:279:1: ( ruleProperty EOF )
            // InternalConfigurationLanguage.g:280:1: ruleProperty EOF
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
    // InternalConfigurationLanguage.g:287:1: ruleProperty : ( ( rule__Property__Group__0 ) ) ;
    public final void ruleProperty() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConfigurationLanguage.g:291:2: ( ( ( rule__Property__Group__0 ) ) )
            // InternalConfigurationLanguage.g:292:2: ( ( rule__Property__Group__0 ) )
            {
            // InternalConfigurationLanguage.g:292:2: ( ( rule__Property__Group__0 ) )
            // InternalConfigurationLanguage.g:293:3: ( rule__Property__Group__0 )
            {
             before(grammarAccess.getPropertyAccess().getGroup()); 
            // InternalConfigurationLanguage.g:294:3: ( rule__Property__Group__0 )
            // InternalConfigurationLanguage.g:294:4: rule__Property__Group__0
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
    // InternalConfigurationLanguage.g:302:1: rule__Type__Alternatives : ( ( ruleContentType ) | ( rulePageType ) | ( ruleReferenceType ) );
    public final void rule__Type__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConfigurationLanguage.g:306:1: ( ( ruleContentType ) | ( rulePageType ) | ( ruleReferenceType ) )
            int alt2=3;
            switch ( input.LA(1) ) {
            case 11:
                {
                alt2=1;
                }
                break;
            case 18:
                {
                alt2=2;
                }
                break;
            case 17:
                {
                alt2=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // InternalConfigurationLanguage.g:307:2: ( ruleContentType )
                    {
                    // InternalConfigurationLanguage.g:307:2: ( ruleContentType )
                    // InternalConfigurationLanguage.g:308:3: ruleContentType
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
                    // InternalConfigurationLanguage.g:313:2: ( rulePageType )
                    {
                    // InternalConfigurationLanguage.g:313:2: ( rulePageType )
                    // InternalConfigurationLanguage.g:314:3: rulePageType
                    {
                     before(grammarAccess.getTypeAccess().getPageTypeParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    rulePageType();

                    state._fsp--;

                     after(grammarAccess.getTypeAccess().getPageTypeParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalConfigurationLanguage.g:319:2: ( ruleReferenceType )
                    {
                    // InternalConfigurationLanguage.g:319:2: ( ruleReferenceType )
                    // InternalConfigurationLanguage.g:320:3: ruleReferenceType
                    {
                     before(grammarAccess.getTypeAccess().getReferenceTypeParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleReferenceType();

                    state._fsp--;

                     after(grammarAccess.getTypeAccess().getReferenceTypeParserRuleCall_2()); 

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
    // InternalConfigurationLanguage.g:329:1: rule__PageSelector__Alternatives : ( ( ruleCssSelector ) | ( ruleUrlPatternSelector ) );
    public final void rule__PageSelector__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConfigurationLanguage.g:333:1: ( ( ruleCssSelector ) | ( ruleUrlPatternSelector ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==19) ) {
                alt3=1;
            }
            else if ( (LA3_0==20) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalConfigurationLanguage.g:334:2: ( ruleCssSelector )
                    {
                    // InternalConfigurationLanguage.g:334:2: ( ruleCssSelector )
                    // InternalConfigurationLanguage.g:335:3: ruleCssSelector
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
                    // InternalConfigurationLanguage.g:340:2: ( ruleUrlPatternSelector )
                    {
                    // InternalConfigurationLanguage.g:340:2: ( ruleUrlPatternSelector )
                    // InternalConfigurationLanguage.g:341:3: ruleUrlPatternSelector
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
    // InternalConfigurationLanguage.g:350:1: rule__ContentType__Group__0 : rule__ContentType__Group__0__Impl rule__ContentType__Group__1 ;
    public final void rule__ContentType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConfigurationLanguage.g:354:1: ( rule__ContentType__Group__0__Impl rule__ContentType__Group__1 )
            // InternalConfigurationLanguage.g:355:2: rule__ContentType__Group__0__Impl rule__ContentType__Group__1
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
    // InternalConfigurationLanguage.g:362:1: rule__ContentType__Group__0__Impl : ( 'content' ) ;
    public final void rule__ContentType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConfigurationLanguage.g:366:1: ( ( 'content' ) )
            // InternalConfigurationLanguage.g:367:1: ( 'content' )
            {
            // InternalConfigurationLanguage.g:367:1: ( 'content' )
            // InternalConfigurationLanguage.g:368:2: 'content'
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
    // InternalConfigurationLanguage.g:377:1: rule__ContentType__Group__1 : rule__ContentType__Group__1__Impl rule__ContentType__Group__2 ;
    public final void rule__ContentType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConfigurationLanguage.g:381:1: ( rule__ContentType__Group__1__Impl rule__ContentType__Group__2 )
            // InternalConfigurationLanguage.g:382:2: rule__ContentType__Group__1__Impl rule__ContentType__Group__2
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
    // InternalConfigurationLanguage.g:389:1: rule__ContentType__Group__1__Impl : ( 'type' ) ;
    public final void rule__ContentType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConfigurationLanguage.g:393:1: ( ( 'type' ) )
            // InternalConfigurationLanguage.g:394:1: ( 'type' )
            {
            // InternalConfigurationLanguage.g:394:1: ( 'type' )
            // InternalConfigurationLanguage.g:395:2: 'type'
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
    // InternalConfigurationLanguage.g:404:1: rule__ContentType__Group__2 : rule__ContentType__Group__2__Impl rule__ContentType__Group__3 ;
    public final void rule__ContentType__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConfigurationLanguage.g:408:1: ( rule__ContentType__Group__2__Impl rule__ContentType__Group__3 )
            // InternalConfigurationLanguage.g:409:2: rule__ContentType__Group__2__Impl rule__ContentType__Group__3
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
    // InternalConfigurationLanguage.g:416:1: rule__ContentType__Group__2__Impl : ( ( rule__ContentType__NameAssignment_2 ) ) ;
    public final void rule__ContentType__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConfigurationLanguage.g:420:1: ( ( ( rule__ContentType__NameAssignment_2 ) ) )
            // InternalConfigurationLanguage.g:421:1: ( ( rule__ContentType__NameAssignment_2 ) )
            {
            // InternalConfigurationLanguage.g:421:1: ( ( rule__ContentType__NameAssignment_2 ) )
            // InternalConfigurationLanguage.g:422:2: ( rule__ContentType__NameAssignment_2 )
            {
             before(grammarAccess.getContentTypeAccess().getNameAssignment_2()); 
            // InternalConfigurationLanguage.g:423:2: ( rule__ContentType__NameAssignment_2 )
            // InternalConfigurationLanguage.g:423:3: rule__ContentType__NameAssignment_2
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
    // InternalConfigurationLanguage.g:431:1: rule__ContentType__Group__3 : rule__ContentType__Group__3__Impl rule__ContentType__Group__4 ;
    public final void rule__ContentType__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConfigurationLanguage.g:435:1: ( rule__ContentType__Group__3__Impl rule__ContentType__Group__4 )
            // InternalConfigurationLanguage.g:436:2: rule__ContentType__Group__3__Impl rule__ContentType__Group__4
            {
            pushFollow(FOLLOW_6);
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
    // InternalConfigurationLanguage.g:443:1: rule__ContentType__Group__3__Impl : ( ( rule__ContentType__Group_3__0 )? ) ;
    public final void rule__ContentType__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConfigurationLanguage.g:447:1: ( ( ( rule__ContentType__Group_3__0 )? ) )
            // InternalConfigurationLanguage.g:448:1: ( ( rule__ContentType__Group_3__0 )? )
            {
            // InternalConfigurationLanguage.g:448:1: ( ( rule__ContentType__Group_3__0 )? )
            // InternalConfigurationLanguage.g:449:2: ( rule__ContentType__Group_3__0 )?
            {
             before(grammarAccess.getContentTypeAccess().getGroup_3()); 
            // InternalConfigurationLanguage.g:450:2: ( rule__ContentType__Group_3__0 )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==13) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalConfigurationLanguage.g:450:3: rule__ContentType__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ContentType__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getContentTypeAccess().getGroup_3()); 

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
    // InternalConfigurationLanguage.g:458:1: rule__ContentType__Group__4 : rule__ContentType__Group__4__Impl ;
    public final void rule__ContentType__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConfigurationLanguage.g:462:1: ( rule__ContentType__Group__4__Impl )
            // InternalConfigurationLanguage.g:463:2: rule__ContentType__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ContentType__Group__4__Impl();

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
    // InternalConfigurationLanguage.g:469:1: rule__ContentType__Group__4__Impl : ( ( rule__ContentType__Group_4__0 )? ) ;
    public final void rule__ContentType__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConfigurationLanguage.g:473:1: ( ( ( rule__ContentType__Group_4__0 )? ) )
            // InternalConfigurationLanguage.g:474:1: ( ( rule__ContentType__Group_4__0 )? )
            {
            // InternalConfigurationLanguage.g:474:1: ( ( rule__ContentType__Group_4__0 )? )
            // InternalConfigurationLanguage.g:475:2: ( rule__ContentType__Group_4__0 )?
            {
             before(grammarAccess.getContentTypeAccess().getGroup_4()); 
            // InternalConfigurationLanguage.g:476:2: ( rule__ContentType__Group_4__0 )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==16) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalConfigurationLanguage.g:476:3: rule__ContentType__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ContentType__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getContentTypeAccess().getGroup_4()); 

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


    // $ANTLR start "rule__ContentType__Group_3__0"
    // InternalConfigurationLanguage.g:485:1: rule__ContentType__Group_3__0 : rule__ContentType__Group_3__0__Impl rule__ContentType__Group_3__1 ;
    public final void rule__ContentType__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConfigurationLanguage.g:489:1: ( rule__ContentType__Group_3__0__Impl rule__ContentType__Group_3__1 )
            // InternalConfigurationLanguage.g:490:2: rule__ContentType__Group_3__0__Impl rule__ContentType__Group_3__1
            {
            pushFollow(FOLLOW_7);
            rule__ContentType__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ContentType__Group_3__1();

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
    // $ANTLR end "rule__ContentType__Group_3__0"


    // $ANTLR start "rule__ContentType__Group_3__0__Impl"
    // InternalConfigurationLanguage.g:497:1: rule__ContentType__Group_3__0__Impl : ( 'is' ) ;
    public final void rule__ContentType__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConfigurationLanguage.g:501:1: ( ( 'is' ) )
            // InternalConfigurationLanguage.g:502:1: ( 'is' )
            {
            // InternalConfigurationLanguage.g:502:1: ( 'is' )
            // InternalConfigurationLanguage.g:503:2: 'is'
            {
             before(grammarAccess.getContentTypeAccess().getIsKeyword_3_0()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getContentTypeAccess().getIsKeyword_3_0()); 

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
    // $ANTLR end "rule__ContentType__Group_3__0__Impl"


    // $ANTLR start "rule__ContentType__Group_3__1"
    // InternalConfigurationLanguage.g:512:1: rule__ContentType__Group_3__1 : rule__ContentType__Group_3__1__Impl rule__ContentType__Group_3__2 ;
    public final void rule__ContentType__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConfigurationLanguage.g:516:1: ( rule__ContentType__Group_3__1__Impl rule__ContentType__Group_3__2 )
            // InternalConfigurationLanguage.g:517:2: rule__ContentType__Group_3__1__Impl rule__ContentType__Group_3__2
            {
            pushFollow(FOLLOW_8);
            rule__ContentType__Group_3__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ContentType__Group_3__2();

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
    // $ANTLR end "rule__ContentType__Group_3__1"


    // $ANTLR start "rule__ContentType__Group_3__1__Impl"
    // InternalConfigurationLanguage.g:524:1: rule__ContentType__Group_3__1__Impl : ( 'recognized' ) ;
    public final void rule__ContentType__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConfigurationLanguage.g:528:1: ( ( 'recognized' ) )
            // InternalConfigurationLanguage.g:529:1: ( 'recognized' )
            {
            // InternalConfigurationLanguage.g:529:1: ( 'recognized' )
            // InternalConfigurationLanguage.g:530:2: 'recognized'
            {
             before(grammarAccess.getContentTypeAccess().getRecognizedKeyword_3_1()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getContentTypeAccess().getRecognizedKeyword_3_1()); 

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
    // $ANTLR end "rule__ContentType__Group_3__1__Impl"


    // $ANTLR start "rule__ContentType__Group_3__2"
    // InternalConfigurationLanguage.g:539:1: rule__ContentType__Group_3__2 : rule__ContentType__Group_3__2__Impl rule__ContentType__Group_3__3 ;
    public final void rule__ContentType__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConfigurationLanguage.g:543:1: ( rule__ContentType__Group_3__2__Impl rule__ContentType__Group_3__3 )
            // InternalConfigurationLanguage.g:544:2: rule__ContentType__Group_3__2__Impl rule__ContentType__Group_3__3
            {
            pushFollow(FOLLOW_9);
            rule__ContentType__Group_3__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ContentType__Group_3__3();

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
    // $ANTLR end "rule__ContentType__Group_3__2"


    // $ANTLR start "rule__ContentType__Group_3__2__Impl"
    // InternalConfigurationLanguage.g:551:1: rule__ContentType__Group_3__2__Impl : ( 'by' ) ;
    public final void rule__ContentType__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConfigurationLanguage.g:555:1: ( ( 'by' ) )
            // InternalConfigurationLanguage.g:556:1: ( 'by' )
            {
            // InternalConfigurationLanguage.g:556:1: ( 'by' )
            // InternalConfigurationLanguage.g:557:2: 'by'
            {
             before(grammarAccess.getContentTypeAccess().getByKeyword_3_2()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getContentTypeAccess().getByKeyword_3_2()); 

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
    // $ANTLR end "rule__ContentType__Group_3__2__Impl"


    // $ANTLR start "rule__ContentType__Group_3__3"
    // InternalConfigurationLanguage.g:566:1: rule__ContentType__Group_3__3 : rule__ContentType__Group_3__3__Impl ;
    public final void rule__ContentType__Group_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConfigurationLanguage.g:570:1: ( rule__ContentType__Group_3__3__Impl )
            // InternalConfigurationLanguage.g:571:2: rule__ContentType__Group_3__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ContentType__Group_3__3__Impl();

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
    // $ANTLR end "rule__ContentType__Group_3__3"


    // $ANTLR start "rule__ContentType__Group_3__3__Impl"
    // InternalConfigurationLanguage.g:577:1: rule__ContentType__Group_3__3__Impl : ( ( rule__ContentType__SelectorAssignment_3_3 ) ) ;
    public final void rule__ContentType__Group_3__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConfigurationLanguage.g:581:1: ( ( ( rule__ContentType__SelectorAssignment_3_3 ) ) )
            // InternalConfigurationLanguage.g:582:1: ( ( rule__ContentType__SelectorAssignment_3_3 ) )
            {
            // InternalConfigurationLanguage.g:582:1: ( ( rule__ContentType__SelectorAssignment_3_3 ) )
            // InternalConfigurationLanguage.g:583:2: ( rule__ContentType__SelectorAssignment_3_3 )
            {
             before(grammarAccess.getContentTypeAccess().getSelectorAssignment_3_3()); 
            // InternalConfigurationLanguage.g:584:2: ( rule__ContentType__SelectorAssignment_3_3 )
            // InternalConfigurationLanguage.g:584:3: rule__ContentType__SelectorAssignment_3_3
            {
            pushFollow(FOLLOW_2);
            rule__ContentType__SelectorAssignment_3_3();

            state._fsp--;


            }

             after(grammarAccess.getContentTypeAccess().getSelectorAssignment_3_3()); 

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
    // $ANTLR end "rule__ContentType__Group_3__3__Impl"


    // $ANTLR start "rule__ContentType__Group_4__0"
    // InternalConfigurationLanguage.g:593:1: rule__ContentType__Group_4__0 : rule__ContentType__Group_4__0__Impl rule__ContentType__Group_4__1 ;
    public final void rule__ContentType__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConfigurationLanguage.g:597:1: ( rule__ContentType__Group_4__0__Impl rule__ContentType__Group_4__1 )
            // InternalConfigurationLanguage.g:598:2: rule__ContentType__Group_4__0__Impl rule__ContentType__Group_4__1
            {
            pushFollow(FOLLOW_5);
            rule__ContentType__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ContentType__Group_4__1();

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
    // $ANTLR end "rule__ContentType__Group_4__0"


    // $ANTLR start "rule__ContentType__Group_4__0__Impl"
    // InternalConfigurationLanguage.g:605:1: rule__ContentType__Group_4__0__Impl : ( 'recognize' ) ;
    public final void rule__ContentType__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConfigurationLanguage.g:609:1: ( ( 'recognize' ) )
            // InternalConfigurationLanguage.g:610:1: ( 'recognize' )
            {
            // InternalConfigurationLanguage.g:610:1: ( 'recognize' )
            // InternalConfigurationLanguage.g:611:2: 'recognize'
            {
             before(grammarAccess.getContentTypeAccess().getRecognizeKeyword_4_0()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getContentTypeAccess().getRecognizeKeyword_4_0()); 

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
    // $ANTLR end "rule__ContentType__Group_4__0__Impl"


    // $ANTLR start "rule__ContentType__Group_4__1"
    // InternalConfigurationLanguage.g:620:1: rule__ContentType__Group_4__1 : rule__ContentType__Group_4__1__Impl ;
    public final void rule__ContentType__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConfigurationLanguage.g:624:1: ( rule__ContentType__Group_4__1__Impl )
            // InternalConfigurationLanguage.g:625:2: rule__ContentType__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ContentType__Group_4__1__Impl();

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
    // $ANTLR end "rule__ContentType__Group_4__1"


    // $ANTLR start "rule__ContentType__Group_4__1__Impl"
    // InternalConfigurationLanguage.g:631:1: rule__ContentType__Group_4__1__Impl : ( ( rule__ContentType__PropertiesAssignment_4_1 )* ) ;
    public final void rule__ContentType__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConfigurationLanguage.g:635:1: ( ( ( rule__ContentType__PropertiesAssignment_4_1 )* ) )
            // InternalConfigurationLanguage.g:636:1: ( ( rule__ContentType__PropertiesAssignment_4_1 )* )
            {
            // InternalConfigurationLanguage.g:636:1: ( ( rule__ContentType__PropertiesAssignment_4_1 )* )
            // InternalConfigurationLanguage.g:637:2: ( rule__ContentType__PropertiesAssignment_4_1 )*
            {
             before(grammarAccess.getContentTypeAccess().getPropertiesAssignment_4_1()); 
            // InternalConfigurationLanguage.g:638:2: ( rule__ContentType__PropertiesAssignment_4_1 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==RULE_ID) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalConfigurationLanguage.g:638:3: rule__ContentType__PropertiesAssignment_4_1
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__ContentType__PropertiesAssignment_4_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

             after(grammarAccess.getContentTypeAccess().getPropertiesAssignment_4_1()); 

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
    // $ANTLR end "rule__ContentType__Group_4__1__Impl"


    // $ANTLR start "rule__ReferenceType__Group__0"
    // InternalConfigurationLanguage.g:647:1: rule__ReferenceType__Group__0 : rule__ReferenceType__Group__0__Impl rule__ReferenceType__Group__1 ;
    public final void rule__ReferenceType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConfigurationLanguage.g:651:1: ( rule__ReferenceType__Group__0__Impl rule__ReferenceType__Group__1 )
            // InternalConfigurationLanguage.g:652:2: rule__ReferenceType__Group__0__Impl rule__ReferenceType__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__ReferenceType__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ReferenceType__Group__1();

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
    // $ANTLR end "rule__ReferenceType__Group__0"


    // $ANTLR start "rule__ReferenceType__Group__0__Impl"
    // InternalConfigurationLanguage.g:659:1: rule__ReferenceType__Group__0__Impl : ( 'reference' ) ;
    public final void rule__ReferenceType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConfigurationLanguage.g:663:1: ( ( 'reference' ) )
            // InternalConfigurationLanguage.g:664:1: ( 'reference' )
            {
            // InternalConfigurationLanguage.g:664:1: ( 'reference' )
            // InternalConfigurationLanguage.g:665:2: 'reference'
            {
             before(grammarAccess.getReferenceTypeAccess().getReferenceKeyword_0()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getReferenceTypeAccess().getReferenceKeyword_0()); 

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
    // $ANTLR end "rule__ReferenceType__Group__0__Impl"


    // $ANTLR start "rule__ReferenceType__Group__1"
    // InternalConfigurationLanguage.g:674:1: rule__ReferenceType__Group__1 : rule__ReferenceType__Group__1__Impl rule__ReferenceType__Group__2 ;
    public final void rule__ReferenceType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConfigurationLanguage.g:678:1: ( rule__ReferenceType__Group__1__Impl rule__ReferenceType__Group__2 )
            // InternalConfigurationLanguage.g:679:2: rule__ReferenceType__Group__1__Impl rule__ReferenceType__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__ReferenceType__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ReferenceType__Group__2();

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
    // $ANTLR end "rule__ReferenceType__Group__1"


    // $ANTLR start "rule__ReferenceType__Group__1__Impl"
    // InternalConfigurationLanguage.g:686:1: rule__ReferenceType__Group__1__Impl : ( 'type' ) ;
    public final void rule__ReferenceType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConfigurationLanguage.g:690:1: ( ( 'type' ) )
            // InternalConfigurationLanguage.g:691:1: ( 'type' )
            {
            // InternalConfigurationLanguage.g:691:1: ( 'type' )
            // InternalConfigurationLanguage.g:692:2: 'type'
            {
             before(grammarAccess.getReferenceTypeAccess().getTypeKeyword_1()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getReferenceTypeAccess().getTypeKeyword_1()); 

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
    // $ANTLR end "rule__ReferenceType__Group__1__Impl"


    // $ANTLR start "rule__ReferenceType__Group__2"
    // InternalConfigurationLanguage.g:701:1: rule__ReferenceType__Group__2 : rule__ReferenceType__Group__2__Impl rule__ReferenceType__Group__3 ;
    public final void rule__ReferenceType__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConfigurationLanguage.g:705:1: ( rule__ReferenceType__Group__2__Impl rule__ReferenceType__Group__3 )
            // InternalConfigurationLanguage.g:706:2: rule__ReferenceType__Group__2__Impl rule__ReferenceType__Group__3
            {
            pushFollow(FOLLOW_6);
            rule__ReferenceType__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ReferenceType__Group__3();

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
    // $ANTLR end "rule__ReferenceType__Group__2"


    // $ANTLR start "rule__ReferenceType__Group__2__Impl"
    // InternalConfigurationLanguage.g:713:1: rule__ReferenceType__Group__2__Impl : ( ( rule__ReferenceType__NameAssignment_2 ) ) ;
    public final void rule__ReferenceType__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConfigurationLanguage.g:717:1: ( ( ( rule__ReferenceType__NameAssignment_2 ) ) )
            // InternalConfigurationLanguage.g:718:1: ( ( rule__ReferenceType__NameAssignment_2 ) )
            {
            // InternalConfigurationLanguage.g:718:1: ( ( rule__ReferenceType__NameAssignment_2 ) )
            // InternalConfigurationLanguage.g:719:2: ( rule__ReferenceType__NameAssignment_2 )
            {
             before(grammarAccess.getReferenceTypeAccess().getNameAssignment_2()); 
            // InternalConfigurationLanguage.g:720:2: ( rule__ReferenceType__NameAssignment_2 )
            // InternalConfigurationLanguage.g:720:3: rule__ReferenceType__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__ReferenceType__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getReferenceTypeAccess().getNameAssignment_2()); 

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
    // $ANTLR end "rule__ReferenceType__Group__2__Impl"


    // $ANTLR start "rule__ReferenceType__Group__3"
    // InternalConfigurationLanguage.g:728:1: rule__ReferenceType__Group__3 : rule__ReferenceType__Group__3__Impl rule__ReferenceType__Group__4 ;
    public final void rule__ReferenceType__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConfigurationLanguage.g:732:1: ( rule__ReferenceType__Group__3__Impl rule__ReferenceType__Group__4 )
            // InternalConfigurationLanguage.g:733:2: rule__ReferenceType__Group__3__Impl rule__ReferenceType__Group__4
            {
            pushFollow(FOLLOW_6);
            rule__ReferenceType__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ReferenceType__Group__4();

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
    // $ANTLR end "rule__ReferenceType__Group__3"


    // $ANTLR start "rule__ReferenceType__Group__3__Impl"
    // InternalConfigurationLanguage.g:740:1: rule__ReferenceType__Group__3__Impl : ( ( rule__ReferenceType__Group_3__0 )? ) ;
    public final void rule__ReferenceType__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConfigurationLanguage.g:744:1: ( ( ( rule__ReferenceType__Group_3__0 )? ) )
            // InternalConfigurationLanguage.g:745:1: ( ( rule__ReferenceType__Group_3__0 )? )
            {
            // InternalConfigurationLanguage.g:745:1: ( ( rule__ReferenceType__Group_3__0 )? )
            // InternalConfigurationLanguage.g:746:2: ( rule__ReferenceType__Group_3__0 )?
            {
             before(grammarAccess.getReferenceTypeAccess().getGroup_3()); 
            // InternalConfigurationLanguage.g:747:2: ( rule__ReferenceType__Group_3__0 )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==13) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalConfigurationLanguage.g:747:3: rule__ReferenceType__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ReferenceType__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getReferenceTypeAccess().getGroup_3()); 

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
    // $ANTLR end "rule__ReferenceType__Group__3__Impl"


    // $ANTLR start "rule__ReferenceType__Group__4"
    // InternalConfigurationLanguage.g:755:1: rule__ReferenceType__Group__4 : rule__ReferenceType__Group__4__Impl ;
    public final void rule__ReferenceType__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConfigurationLanguage.g:759:1: ( rule__ReferenceType__Group__4__Impl )
            // InternalConfigurationLanguage.g:760:2: rule__ReferenceType__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ReferenceType__Group__4__Impl();

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
    // $ANTLR end "rule__ReferenceType__Group__4"


    // $ANTLR start "rule__ReferenceType__Group__4__Impl"
    // InternalConfigurationLanguage.g:766:1: rule__ReferenceType__Group__4__Impl : ( ( rule__ReferenceType__Group_4__0 )? ) ;
    public final void rule__ReferenceType__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConfigurationLanguage.g:770:1: ( ( ( rule__ReferenceType__Group_4__0 )? ) )
            // InternalConfigurationLanguage.g:771:1: ( ( rule__ReferenceType__Group_4__0 )? )
            {
            // InternalConfigurationLanguage.g:771:1: ( ( rule__ReferenceType__Group_4__0 )? )
            // InternalConfigurationLanguage.g:772:2: ( rule__ReferenceType__Group_4__0 )?
            {
             before(grammarAccess.getReferenceTypeAccess().getGroup_4()); 
            // InternalConfigurationLanguage.g:773:2: ( rule__ReferenceType__Group_4__0 )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==16) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalConfigurationLanguage.g:773:3: rule__ReferenceType__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ReferenceType__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getReferenceTypeAccess().getGroup_4()); 

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
    // $ANTLR end "rule__ReferenceType__Group__4__Impl"


    // $ANTLR start "rule__ReferenceType__Group_3__0"
    // InternalConfigurationLanguage.g:782:1: rule__ReferenceType__Group_3__0 : rule__ReferenceType__Group_3__0__Impl rule__ReferenceType__Group_3__1 ;
    public final void rule__ReferenceType__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConfigurationLanguage.g:786:1: ( rule__ReferenceType__Group_3__0__Impl rule__ReferenceType__Group_3__1 )
            // InternalConfigurationLanguage.g:787:2: rule__ReferenceType__Group_3__0__Impl rule__ReferenceType__Group_3__1
            {
            pushFollow(FOLLOW_7);
            rule__ReferenceType__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ReferenceType__Group_3__1();

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
    // $ANTLR end "rule__ReferenceType__Group_3__0"


    // $ANTLR start "rule__ReferenceType__Group_3__0__Impl"
    // InternalConfigurationLanguage.g:794:1: rule__ReferenceType__Group_3__0__Impl : ( 'is' ) ;
    public final void rule__ReferenceType__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConfigurationLanguage.g:798:1: ( ( 'is' ) )
            // InternalConfigurationLanguage.g:799:1: ( 'is' )
            {
            // InternalConfigurationLanguage.g:799:1: ( 'is' )
            // InternalConfigurationLanguage.g:800:2: 'is'
            {
             before(grammarAccess.getReferenceTypeAccess().getIsKeyword_3_0()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getReferenceTypeAccess().getIsKeyword_3_0()); 

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
    // $ANTLR end "rule__ReferenceType__Group_3__0__Impl"


    // $ANTLR start "rule__ReferenceType__Group_3__1"
    // InternalConfigurationLanguage.g:809:1: rule__ReferenceType__Group_3__1 : rule__ReferenceType__Group_3__1__Impl rule__ReferenceType__Group_3__2 ;
    public final void rule__ReferenceType__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConfigurationLanguage.g:813:1: ( rule__ReferenceType__Group_3__1__Impl rule__ReferenceType__Group_3__2 )
            // InternalConfigurationLanguage.g:814:2: rule__ReferenceType__Group_3__1__Impl rule__ReferenceType__Group_3__2
            {
            pushFollow(FOLLOW_8);
            rule__ReferenceType__Group_3__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ReferenceType__Group_3__2();

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
    // $ANTLR end "rule__ReferenceType__Group_3__1"


    // $ANTLR start "rule__ReferenceType__Group_3__1__Impl"
    // InternalConfigurationLanguage.g:821:1: rule__ReferenceType__Group_3__1__Impl : ( 'recognized' ) ;
    public final void rule__ReferenceType__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConfigurationLanguage.g:825:1: ( ( 'recognized' ) )
            // InternalConfigurationLanguage.g:826:1: ( 'recognized' )
            {
            // InternalConfigurationLanguage.g:826:1: ( 'recognized' )
            // InternalConfigurationLanguage.g:827:2: 'recognized'
            {
             before(grammarAccess.getReferenceTypeAccess().getRecognizedKeyword_3_1()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getReferenceTypeAccess().getRecognizedKeyword_3_1()); 

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
    // $ANTLR end "rule__ReferenceType__Group_3__1__Impl"


    // $ANTLR start "rule__ReferenceType__Group_3__2"
    // InternalConfigurationLanguage.g:836:1: rule__ReferenceType__Group_3__2 : rule__ReferenceType__Group_3__2__Impl rule__ReferenceType__Group_3__3 ;
    public final void rule__ReferenceType__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConfigurationLanguage.g:840:1: ( rule__ReferenceType__Group_3__2__Impl rule__ReferenceType__Group_3__3 )
            // InternalConfigurationLanguage.g:841:2: rule__ReferenceType__Group_3__2__Impl rule__ReferenceType__Group_3__3
            {
            pushFollow(FOLLOW_9);
            rule__ReferenceType__Group_3__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ReferenceType__Group_3__3();

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
    // $ANTLR end "rule__ReferenceType__Group_3__2"


    // $ANTLR start "rule__ReferenceType__Group_3__2__Impl"
    // InternalConfigurationLanguage.g:848:1: rule__ReferenceType__Group_3__2__Impl : ( 'by' ) ;
    public final void rule__ReferenceType__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConfigurationLanguage.g:852:1: ( ( 'by' ) )
            // InternalConfigurationLanguage.g:853:1: ( 'by' )
            {
            // InternalConfigurationLanguage.g:853:1: ( 'by' )
            // InternalConfigurationLanguage.g:854:2: 'by'
            {
             before(grammarAccess.getReferenceTypeAccess().getByKeyword_3_2()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getReferenceTypeAccess().getByKeyword_3_2()); 

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
    // $ANTLR end "rule__ReferenceType__Group_3__2__Impl"


    // $ANTLR start "rule__ReferenceType__Group_3__3"
    // InternalConfigurationLanguage.g:863:1: rule__ReferenceType__Group_3__3 : rule__ReferenceType__Group_3__3__Impl ;
    public final void rule__ReferenceType__Group_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConfigurationLanguage.g:867:1: ( rule__ReferenceType__Group_3__3__Impl )
            // InternalConfigurationLanguage.g:868:2: rule__ReferenceType__Group_3__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ReferenceType__Group_3__3__Impl();

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
    // $ANTLR end "rule__ReferenceType__Group_3__3"


    // $ANTLR start "rule__ReferenceType__Group_3__3__Impl"
    // InternalConfigurationLanguage.g:874:1: rule__ReferenceType__Group_3__3__Impl : ( ( rule__ReferenceType__SelectorAssignment_3_3 ) ) ;
    public final void rule__ReferenceType__Group_3__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConfigurationLanguage.g:878:1: ( ( ( rule__ReferenceType__SelectorAssignment_3_3 ) ) )
            // InternalConfigurationLanguage.g:879:1: ( ( rule__ReferenceType__SelectorAssignment_3_3 ) )
            {
            // InternalConfigurationLanguage.g:879:1: ( ( rule__ReferenceType__SelectorAssignment_3_3 ) )
            // InternalConfigurationLanguage.g:880:2: ( rule__ReferenceType__SelectorAssignment_3_3 )
            {
             before(grammarAccess.getReferenceTypeAccess().getSelectorAssignment_3_3()); 
            // InternalConfigurationLanguage.g:881:2: ( rule__ReferenceType__SelectorAssignment_3_3 )
            // InternalConfigurationLanguage.g:881:3: rule__ReferenceType__SelectorAssignment_3_3
            {
            pushFollow(FOLLOW_2);
            rule__ReferenceType__SelectorAssignment_3_3();

            state._fsp--;


            }

             after(grammarAccess.getReferenceTypeAccess().getSelectorAssignment_3_3()); 

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
    // $ANTLR end "rule__ReferenceType__Group_3__3__Impl"


    // $ANTLR start "rule__ReferenceType__Group_4__0"
    // InternalConfigurationLanguage.g:890:1: rule__ReferenceType__Group_4__0 : rule__ReferenceType__Group_4__0__Impl rule__ReferenceType__Group_4__1 ;
    public final void rule__ReferenceType__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConfigurationLanguage.g:894:1: ( rule__ReferenceType__Group_4__0__Impl rule__ReferenceType__Group_4__1 )
            // InternalConfigurationLanguage.g:895:2: rule__ReferenceType__Group_4__0__Impl rule__ReferenceType__Group_4__1
            {
            pushFollow(FOLLOW_5);
            rule__ReferenceType__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ReferenceType__Group_4__1();

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
    // $ANTLR end "rule__ReferenceType__Group_4__0"


    // $ANTLR start "rule__ReferenceType__Group_4__0__Impl"
    // InternalConfigurationLanguage.g:902:1: rule__ReferenceType__Group_4__0__Impl : ( 'recognize' ) ;
    public final void rule__ReferenceType__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConfigurationLanguage.g:906:1: ( ( 'recognize' ) )
            // InternalConfigurationLanguage.g:907:1: ( 'recognize' )
            {
            // InternalConfigurationLanguage.g:907:1: ( 'recognize' )
            // InternalConfigurationLanguage.g:908:2: 'recognize'
            {
             before(grammarAccess.getReferenceTypeAccess().getRecognizeKeyword_4_0()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getReferenceTypeAccess().getRecognizeKeyword_4_0()); 

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
    // $ANTLR end "rule__ReferenceType__Group_4__0__Impl"


    // $ANTLR start "rule__ReferenceType__Group_4__1"
    // InternalConfigurationLanguage.g:917:1: rule__ReferenceType__Group_4__1 : rule__ReferenceType__Group_4__1__Impl ;
    public final void rule__ReferenceType__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConfigurationLanguage.g:921:1: ( rule__ReferenceType__Group_4__1__Impl )
            // InternalConfigurationLanguage.g:922:2: rule__ReferenceType__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ReferenceType__Group_4__1__Impl();

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
    // $ANTLR end "rule__ReferenceType__Group_4__1"


    // $ANTLR start "rule__ReferenceType__Group_4__1__Impl"
    // InternalConfigurationLanguage.g:928:1: rule__ReferenceType__Group_4__1__Impl : ( ( rule__ReferenceType__PropertiesAssignment_4_1 )* ) ;
    public final void rule__ReferenceType__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConfigurationLanguage.g:932:1: ( ( ( rule__ReferenceType__PropertiesAssignment_4_1 )* ) )
            // InternalConfigurationLanguage.g:933:1: ( ( rule__ReferenceType__PropertiesAssignment_4_1 )* )
            {
            // InternalConfigurationLanguage.g:933:1: ( ( rule__ReferenceType__PropertiesAssignment_4_1 )* )
            // InternalConfigurationLanguage.g:934:2: ( rule__ReferenceType__PropertiesAssignment_4_1 )*
            {
             before(grammarAccess.getReferenceTypeAccess().getPropertiesAssignment_4_1()); 
            // InternalConfigurationLanguage.g:935:2: ( rule__ReferenceType__PropertiesAssignment_4_1 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==RULE_ID) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalConfigurationLanguage.g:935:3: rule__ReferenceType__PropertiesAssignment_4_1
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__ReferenceType__PropertiesAssignment_4_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

             after(grammarAccess.getReferenceTypeAccess().getPropertiesAssignment_4_1()); 

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
    // $ANTLR end "rule__ReferenceType__Group_4__1__Impl"


    // $ANTLR start "rule__PageType__Group__0"
    // InternalConfigurationLanguage.g:944:1: rule__PageType__Group__0 : rule__PageType__Group__0__Impl rule__PageType__Group__1 ;
    public final void rule__PageType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConfigurationLanguage.g:948:1: ( rule__PageType__Group__0__Impl rule__PageType__Group__1 )
            // InternalConfigurationLanguage.g:949:2: rule__PageType__Group__0__Impl rule__PageType__Group__1
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
    // InternalConfigurationLanguage.g:956:1: rule__PageType__Group__0__Impl : ( 'page' ) ;
    public final void rule__PageType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConfigurationLanguage.g:960:1: ( ( 'page' ) )
            // InternalConfigurationLanguage.g:961:1: ( 'page' )
            {
            // InternalConfigurationLanguage.g:961:1: ( 'page' )
            // InternalConfigurationLanguage.g:962:2: 'page'
            {
             before(grammarAccess.getPageTypeAccess().getPageKeyword_0()); 
            match(input,18,FOLLOW_2); 
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
    // InternalConfigurationLanguage.g:971:1: rule__PageType__Group__1 : rule__PageType__Group__1__Impl rule__PageType__Group__2 ;
    public final void rule__PageType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConfigurationLanguage.g:975:1: ( rule__PageType__Group__1__Impl rule__PageType__Group__2 )
            // InternalConfigurationLanguage.g:976:2: rule__PageType__Group__1__Impl rule__PageType__Group__2
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
    // InternalConfigurationLanguage.g:983:1: rule__PageType__Group__1__Impl : ( 'type' ) ;
    public final void rule__PageType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConfigurationLanguage.g:987:1: ( ( 'type' ) )
            // InternalConfigurationLanguage.g:988:1: ( 'type' )
            {
            // InternalConfigurationLanguage.g:988:1: ( 'type' )
            // InternalConfigurationLanguage.g:989:2: 'type'
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
    // InternalConfigurationLanguage.g:998:1: rule__PageType__Group__2 : rule__PageType__Group__2__Impl rule__PageType__Group__3 ;
    public final void rule__PageType__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConfigurationLanguage.g:1002:1: ( rule__PageType__Group__2__Impl rule__PageType__Group__3 )
            // InternalConfigurationLanguage.g:1003:2: rule__PageType__Group__2__Impl rule__PageType__Group__3
            {
            pushFollow(FOLLOW_11);
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
    // InternalConfigurationLanguage.g:1010:1: rule__PageType__Group__2__Impl : ( ( rule__PageType__NameAssignment_2 ) ) ;
    public final void rule__PageType__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConfigurationLanguage.g:1014:1: ( ( ( rule__PageType__NameAssignment_2 ) ) )
            // InternalConfigurationLanguage.g:1015:1: ( ( rule__PageType__NameAssignment_2 ) )
            {
            // InternalConfigurationLanguage.g:1015:1: ( ( rule__PageType__NameAssignment_2 ) )
            // InternalConfigurationLanguage.g:1016:2: ( rule__PageType__NameAssignment_2 )
            {
             before(grammarAccess.getPageTypeAccess().getNameAssignment_2()); 
            // InternalConfigurationLanguage.g:1017:2: ( rule__PageType__NameAssignment_2 )
            // InternalConfigurationLanguage.g:1017:3: rule__PageType__NameAssignment_2
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
    // InternalConfigurationLanguage.g:1025:1: rule__PageType__Group__3 : rule__PageType__Group__3__Impl rule__PageType__Group__4 ;
    public final void rule__PageType__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConfigurationLanguage.g:1029:1: ( rule__PageType__Group__3__Impl rule__PageType__Group__4 )
            // InternalConfigurationLanguage.g:1030:2: rule__PageType__Group__3__Impl rule__PageType__Group__4
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
    // InternalConfigurationLanguage.g:1037:1: rule__PageType__Group__3__Impl : ( 'is' ) ;
    public final void rule__PageType__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConfigurationLanguage.g:1041:1: ( ( 'is' ) )
            // InternalConfigurationLanguage.g:1042:1: ( 'is' )
            {
            // InternalConfigurationLanguage.g:1042:1: ( 'is' )
            // InternalConfigurationLanguage.g:1043:2: 'is'
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
    // InternalConfigurationLanguage.g:1052:1: rule__PageType__Group__4 : rule__PageType__Group__4__Impl rule__PageType__Group__5 ;
    public final void rule__PageType__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConfigurationLanguage.g:1056:1: ( rule__PageType__Group__4__Impl rule__PageType__Group__5 )
            // InternalConfigurationLanguage.g:1057:2: rule__PageType__Group__4__Impl rule__PageType__Group__5
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
    // InternalConfigurationLanguage.g:1064:1: rule__PageType__Group__4__Impl : ( 'recognized' ) ;
    public final void rule__PageType__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConfigurationLanguage.g:1068:1: ( ( 'recognized' ) )
            // InternalConfigurationLanguage.g:1069:1: ( 'recognized' )
            {
            // InternalConfigurationLanguage.g:1069:1: ( 'recognized' )
            // InternalConfigurationLanguage.g:1070:2: 'recognized'
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
    // InternalConfigurationLanguage.g:1079:1: rule__PageType__Group__5 : rule__PageType__Group__5__Impl rule__PageType__Group__6 ;
    public final void rule__PageType__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConfigurationLanguage.g:1083:1: ( rule__PageType__Group__5__Impl rule__PageType__Group__6 )
            // InternalConfigurationLanguage.g:1084:2: rule__PageType__Group__5__Impl rule__PageType__Group__6
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
    // InternalConfigurationLanguage.g:1091:1: rule__PageType__Group__5__Impl : ( 'by' ) ;
    public final void rule__PageType__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConfigurationLanguage.g:1095:1: ( ( 'by' ) )
            // InternalConfigurationLanguage.g:1096:1: ( 'by' )
            {
            // InternalConfigurationLanguage.g:1096:1: ( 'by' )
            // InternalConfigurationLanguage.g:1097:2: 'by'
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
    // InternalConfigurationLanguage.g:1106:1: rule__PageType__Group__6 : rule__PageType__Group__6__Impl rule__PageType__Group__7 ;
    public final void rule__PageType__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConfigurationLanguage.g:1110:1: ( rule__PageType__Group__6__Impl rule__PageType__Group__7 )
            // InternalConfigurationLanguage.g:1111:2: rule__PageType__Group__6__Impl rule__PageType__Group__7
            {
            pushFollow(FOLLOW_13);
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
    // InternalConfigurationLanguage.g:1118:1: rule__PageType__Group__6__Impl : ( ( rule__PageType__SelectorAssignment_6 ) ) ;
    public final void rule__PageType__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConfigurationLanguage.g:1122:1: ( ( ( rule__PageType__SelectorAssignment_6 ) ) )
            // InternalConfigurationLanguage.g:1123:1: ( ( rule__PageType__SelectorAssignment_6 ) )
            {
            // InternalConfigurationLanguage.g:1123:1: ( ( rule__PageType__SelectorAssignment_6 ) )
            // InternalConfigurationLanguage.g:1124:2: ( rule__PageType__SelectorAssignment_6 )
            {
             before(grammarAccess.getPageTypeAccess().getSelectorAssignment_6()); 
            // InternalConfigurationLanguage.g:1125:2: ( rule__PageType__SelectorAssignment_6 )
            // InternalConfigurationLanguage.g:1125:3: rule__PageType__SelectorAssignment_6
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
    // InternalConfigurationLanguage.g:1133:1: rule__PageType__Group__7 : rule__PageType__Group__7__Impl ;
    public final void rule__PageType__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConfigurationLanguage.g:1137:1: ( rule__PageType__Group__7__Impl )
            // InternalConfigurationLanguage.g:1138:2: rule__PageType__Group__7__Impl
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
    // InternalConfigurationLanguage.g:1144:1: rule__PageType__Group__7__Impl : ( ( rule__PageType__Group_7__0 )? ) ;
    public final void rule__PageType__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConfigurationLanguage.g:1148:1: ( ( ( rule__PageType__Group_7__0 )? ) )
            // InternalConfigurationLanguage.g:1149:1: ( ( rule__PageType__Group_7__0 )? )
            {
            // InternalConfigurationLanguage.g:1149:1: ( ( rule__PageType__Group_7__0 )? )
            // InternalConfigurationLanguage.g:1150:2: ( rule__PageType__Group_7__0 )?
            {
             before(grammarAccess.getPageTypeAccess().getGroup_7()); 
            // InternalConfigurationLanguage.g:1151:2: ( rule__PageType__Group_7__0 )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==16) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalConfigurationLanguage.g:1151:3: rule__PageType__Group_7__0
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
    // InternalConfigurationLanguage.g:1160:1: rule__PageType__Group_7__0 : rule__PageType__Group_7__0__Impl rule__PageType__Group_7__1 ;
    public final void rule__PageType__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConfigurationLanguage.g:1164:1: ( rule__PageType__Group_7__0__Impl rule__PageType__Group_7__1 )
            // InternalConfigurationLanguage.g:1165:2: rule__PageType__Group_7__0__Impl rule__PageType__Group_7__1
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
    // InternalConfigurationLanguage.g:1172:1: rule__PageType__Group_7__0__Impl : ( 'recognize' ) ;
    public final void rule__PageType__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConfigurationLanguage.g:1176:1: ( ( 'recognize' ) )
            // InternalConfigurationLanguage.g:1177:1: ( 'recognize' )
            {
            // InternalConfigurationLanguage.g:1177:1: ( 'recognize' )
            // InternalConfigurationLanguage.g:1178:2: 'recognize'
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
    // InternalConfigurationLanguage.g:1187:1: rule__PageType__Group_7__1 : rule__PageType__Group_7__1__Impl ;
    public final void rule__PageType__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConfigurationLanguage.g:1191:1: ( rule__PageType__Group_7__1__Impl )
            // InternalConfigurationLanguage.g:1192:2: rule__PageType__Group_7__1__Impl
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
    // InternalConfigurationLanguage.g:1198:1: rule__PageType__Group_7__1__Impl : ( ( rule__PageType__PropertiesAssignment_7_1 )* ) ;
    public final void rule__PageType__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConfigurationLanguage.g:1202:1: ( ( ( rule__PageType__PropertiesAssignment_7_1 )* ) )
            // InternalConfigurationLanguage.g:1203:1: ( ( rule__PageType__PropertiesAssignment_7_1 )* )
            {
            // InternalConfigurationLanguage.g:1203:1: ( ( rule__PageType__PropertiesAssignment_7_1 )* )
            // InternalConfigurationLanguage.g:1204:2: ( rule__PageType__PropertiesAssignment_7_1 )*
            {
             before(grammarAccess.getPageTypeAccess().getPropertiesAssignment_7_1()); 
            // InternalConfigurationLanguage.g:1205:2: ( rule__PageType__PropertiesAssignment_7_1 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==RULE_ID) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalConfigurationLanguage.g:1205:3: rule__PageType__PropertiesAssignment_7_1
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__PageType__PropertiesAssignment_7_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop11;
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
    // InternalConfigurationLanguage.g:1214:1: rule__CssSelector__Group__0 : rule__CssSelector__Group__0__Impl rule__CssSelector__Group__1 ;
    public final void rule__CssSelector__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConfigurationLanguage.g:1218:1: ( rule__CssSelector__Group__0__Impl rule__CssSelector__Group__1 )
            // InternalConfigurationLanguage.g:1219:2: rule__CssSelector__Group__0__Impl rule__CssSelector__Group__1
            {
            pushFollow(FOLLOW_14);
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
    // InternalConfigurationLanguage.g:1226:1: rule__CssSelector__Group__0__Impl : ( 'css' ) ;
    public final void rule__CssSelector__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConfigurationLanguage.g:1230:1: ( ( 'css' ) )
            // InternalConfigurationLanguage.g:1231:1: ( 'css' )
            {
            // InternalConfigurationLanguage.g:1231:1: ( 'css' )
            // InternalConfigurationLanguage.g:1232:2: 'css'
            {
             before(grammarAccess.getCssSelectorAccess().getCssKeyword_0()); 
            match(input,19,FOLLOW_2); 
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
    // InternalConfigurationLanguage.g:1241:1: rule__CssSelector__Group__1 : rule__CssSelector__Group__1__Impl ;
    public final void rule__CssSelector__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConfigurationLanguage.g:1245:1: ( rule__CssSelector__Group__1__Impl )
            // InternalConfigurationLanguage.g:1246:2: rule__CssSelector__Group__1__Impl
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
    // InternalConfigurationLanguage.g:1252:1: rule__CssSelector__Group__1__Impl : ( ( rule__CssSelector__DefinitionAssignment_1 ) ) ;
    public final void rule__CssSelector__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConfigurationLanguage.g:1256:1: ( ( ( rule__CssSelector__DefinitionAssignment_1 ) ) )
            // InternalConfigurationLanguage.g:1257:1: ( ( rule__CssSelector__DefinitionAssignment_1 ) )
            {
            // InternalConfigurationLanguage.g:1257:1: ( ( rule__CssSelector__DefinitionAssignment_1 ) )
            // InternalConfigurationLanguage.g:1258:2: ( rule__CssSelector__DefinitionAssignment_1 )
            {
             before(grammarAccess.getCssSelectorAccess().getDefinitionAssignment_1()); 
            // InternalConfigurationLanguage.g:1259:2: ( rule__CssSelector__DefinitionAssignment_1 )
            // InternalConfigurationLanguage.g:1259:3: rule__CssSelector__DefinitionAssignment_1
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
    // InternalConfigurationLanguage.g:1268:1: rule__UrlPatternSelector__Group__0 : rule__UrlPatternSelector__Group__0__Impl rule__UrlPatternSelector__Group__1 ;
    public final void rule__UrlPatternSelector__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConfigurationLanguage.g:1272:1: ( rule__UrlPatternSelector__Group__0__Impl rule__UrlPatternSelector__Group__1 )
            // InternalConfigurationLanguage.g:1273:2: rule__UrlPatternSelector__Group__0__Impl rule__UrlPatternSelector__Group__1
            {
            pushFollow(FOLLOW_15);
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
    // InternalConfigurationLanguage.g:1280:1: rule__UrlPatternSelector__Group__0__Impl : ( 'url' ) ;
    public final void rule__UrlPatternSelector__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConfigurationLanguage.g:1284:1: ( ( 'url' ) )
            // InternalConfigurationLanguage.g:1285:1: ( 'url' )
            {
            // InternalConfigurationLanguage.g:1285:1: ( 'url' )
            // InternalConfigurationLanguage.g:1286:2: 'url'
            {
             before(grammarAccess.getUrlPatternSelectorAccess().getUrlKeyword_0()); 
            match(input,20,FOLLOW_2); 
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
    // InternalConfigurationLanguage.g:1295:1: rule__UrlPatternSelector__Group__1 : rule__UrlPatternSelector__Group__1__Impl rule__UrlPatternSelector__Group__2 ;
    public final void rule__UrlPatternSelector__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConfigurationLanguage.g:1299:1: ( rule__UrlPatternSelector__Group__1__Impl rule__UrlPatternSelector__Group__2 )
            // InternalConfigurationLanguage.g:1300:2: rule__UrlPatternSelector__Group__1__Impl rule__UrlPatternSelector__Group__2
            {
            pushFollow(FOLLOW_14);
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
    // InternalConfigurationLanguage.g:1307:1: rule__UrlPatternSelector__Group__1__Impl : ( 'pattern' ) ;
    public final void rule__UrlPatternSelector__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConfigurationLanguage.g:1311:1: ( ( 'pattern' ) )
            // InternalConfigurationLanguage.g:1312:1: ( 'pattern' )
            {
            // InternalConfigurationLanguage.g:1312:1: ( 'pattern' )
            // InternalConfigurationLanguage.g:1313:2: 'pattern'
            {
             before(grammarAccess.getUrlPatternSelectorAccess().getPatternKeyword_1()); 
            match(input,21,FOLLOW_2); 
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
    // InternalConfigurationLanguage.g:1322:1: rule__UrlPatternSelector__Group__2 : rule__UrlPatternSelector__Group__2__Impl ;
    public final void rule__UrlPatternSelector__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConfigurationLanguage.g:1326:1: ( rule__UrlPatternSelector__Group__2__Impl )
            // InternalConfigurationLanguage.g:1327:2: rule__UrlPatternSelector__Group__2__Impl
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
    // InternalConfigurationLanguage.g:1333:1: rule__UrlPatternSelector__Group__2__Impl : ( ( rule__UrlPatternSelector__DefinitionAssignment_2 ) ) ;
    public final void rule__UrlPatternSelector__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConfigurationLanguage.g:1337:1: ( ( ( rule__UrlPatternSelector__DefinitionAssignment_2 ) ) )
            // InternalConfigurationLanguage.g:1338:1: ( ( rule__UrlPatternSelector__DefinitionAssignment_2 ) )
            {
            // InternalConfigurationLanguage.g:1338:1: ( ( rule__UrlPatternSelector__DefinitionAssignment_2 ) )
            // InternalConfigurationLanguage.g:1339:2: ( rule__UrlPatternSelector__DefinitionAssignment_2 )
            {
             before(grammarAccess.getUrlPatternSelectorAccess().getDefinitionAssignment_2()); 
            // InternalConfigurationLanguage.g:1340:2: ( rule__UrlPatternSelector__DefinitionAssignment_2 )
            // InternalConfigurationLanguage.g:1340:3: rule__UrlPatternSelector__DefinitionAssignment_2
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
    // InternalConfigurationLanguage.g:1349:1: rule__Property__Group__0 : rule__Property__Group__0__Impl rule__Property__Group__1 ;
    public final void rule__Property__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConfigurationLanguage.g:1353:1: ( rule__Property__Group__0__Impl rule__Property__Group__1 )
            // InternalConfigurationLanguage.g:1354:2: rule__Property__Group__0__Impl rule__Property__Group__1
            {
            pushFollow(FOLLOW_16);
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
    // InternalConfigurationLanguage.g:1361:1: rule__Property__Group__0__Impl : ( ( rule__Property__NameAssignment_0 ) ) ;
    public final void rule__Property__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConfigurationLanguage.g:1365:1: ( ( ( rule__Property__NameAssignment_0 ) ) )
            // InternalConfigurationLanguage.g:1366:1: ( ( rule__Property__NameAssignment_0 ) )
            {
            // InternalConfigurationLanguage.g:1366:1: ( ( rule__Property__NameAssignment_0 ) )
            // InternalConfigurationLanguage.g:1367:2: ( rule__Property__NameAssignment_0 )
            {
             before(grammarAccess.getPropertyAccess().getNameAssignment_0()); 
            // InternalConfigurationLanguage.g:1368:2: ( rule__Property__NameAssignment_0 )
            // InternalConfigurationLanguage.g:1368:3: rule__Property__NameAssignment_0
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
    // InternalConfigurationLanguage.g:1376:1: rule__Property__Group__1 : rule__Property__Group__1__Impl rule__Property__Group__2 ;
    public final void rule__Property__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConfigurationLanguage.g:1380:1: ( rule__Property__Group__1__Impl rule__Property__Group__2 )
            // InternalConfigurationLanguage.g:1381:2: rule__Property__Group__1__Impl rule__Property__Group__2
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
    // InternalConfigurationLanguage.g:1388:1: rule__Property__Group__1__Impl : ( 'as' ) ;
    public final void rule__Property__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConfigurationLanguage.g:1392:1: ( ( 'as' ) )
            // InternalConfigurationLanguage.g:1393:1: ( 'as' )
            {
            // InternalConfigurationLanguage.g:1393:1: ( 'as' )
            // InternalConfigurationLanguage.g:1394:2: 'as'
            {
             before(grammarAccess.getPropertyAccess().getAsKeyword_1()); 
            match(input,22,FOLLOW_2); 
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
    // InternalConfigurationLanguage.g:1403:1: rule__Property__Group__2 : rule__Property__Group__2__Impl rule__Property__Group__3 ;
    public final void rule__Property__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConfigurationLanguage.g:1407:1: ( rule__Property__Group__2__Impl rule__Property__Group__3 )
            // InternalConfigurationLanguage.g:1408:2: rule__Property__Group__2__Impl rule__Property__Group__3
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
    // InternalConfigurationLanguage.g:1415:1: rule__Property__Group__2__Impl : ( ( rule__Property__TypeAssignment_2 ) ) ;
    public final void rule__Property__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConfigurationLanguage.g:1419:1: ( ( ( rule__Property__TypeAssignment_2 ) ) )
            // InternalConfigurationLanguage.g:1420:1: ( ( rule__Property__TypeAssignment_2 ) )
            {
            // InternalConfigurationLanguage.g:1420:1: ( ( rule__Property__TypeAssignment_2 ) )
            // InternalConfigurationLanguage.g:1421:2: ( rule__Property__TypeAssignment_2 )
            {
             before(grammarAccess.getPropertyAccess().getTypeAssignment_2()); 
            // InternalConfigurationLanguage.g:1422:2: ( rule__Property__TypeAssignment_2 )
            // InternalConfigurationLanguage.g:1422:3: rule__Property__TypeAssignment_2
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
    // InternalConfigurationLanguage.g:1430:1: rule__Property__Group__3 : rule__Property__Group__3__Impl ;
    public final void rule__Property__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConfigurationLanguage.g:1434:1: ( rule__Property__Group__3__Impl )
            // InternalConfigurationLanguage.g:1435:2: rule__Property__Group__3__Impl
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
    // InternalConfigurationLanguage.g:1441:1: rule__Property__Group__3__Impl : ( ( rule__Property__Group_3__0 )? ) ;
    public final void rule__Property__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConfigurationLanguage.g:1445:1: ( ( ( rule__Property__Group_3__0 )? ) )
            // InternalConfigurationLanguage.g:1446:1: ( ( rule__Property__Group_3__0 )? )
            {
            // InternalConfigurationLanguage.g:1446:1: ( ( rule__Property__Group_3__0 )? )
            // InternalConfigurationLanguage.g:1447:2: ( rule__Property__Group_3__0 )?
            {
             before(grammarAccess.getPropertyAccess().getGroup_3()); 
            // InternalConfigurationLanguage.g:1448:2: ( rule__Property__Group_3__0 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==15) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalConfigurationLanguage.g:1448:3: rule__Property__Group_3__0
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
    // InternalConfigurationLanguage.g:1457:1: rule__Property__Group_3__0 : rule__Property__Group_3__0__Impl rule__Property__Group_3__1 ;
    public final void rule__Property__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConfigurationLanguage.g:1461:1: ( rule__Property__Group_3__0__Impl rule__Property__Group_3__1 )
            // InternalConfigurationLanguage.g:1462:2: rule__Property__Group_3__0__Impl rule__Property__Group_3__1
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
    // InternalConfigurationLanguage.g:1469:1: rule__Property__Group_3__0__Impl : ( 'by' ) ;
    public final void rule__Property__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConfigurationLanguage.g:1473:1: ( ( 'by' ) )
            // InternalConfigurationLanguage.g:1474:1: ( 'by' )
            {
            // InternalConfigurationLanguage.g:1474:1: ( 'by' )
            // InternalConfigurationLanguage.g:1475:2: 'by'
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
    // InternalConfigurationLanguage.g:1484:1: rule__Property__Group_3__1 : rule__Property__Group_3__1__Impl ;
    public final void rule__Property__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConfigurationLanguage.g:1488:1: ( rule__Property__Group_3__1__Impl )
            // InternalConfigurationLanguage.g:1489:2: rule__Property__Group_3__1__Impl
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
    // InternalConfigurationLanguage.g:1495:1: rule__Property__Group_3__1__Impl : ( ( rule__Property__SelectorAssignment_3_1 ) ) ;
    public final void rule__Property__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConfigurationLanguage.g:1499:1: ( ( ( rule__Property__SelectorAssignment_3_1 ) ) )
            // InternalConfigurationLanguage.g:1500:1: ( ( rule__Property__SelectorAssignment_3_1 ) )
            {
            // InternalConfigurationLanguage.g:1500:1: ( ( rule__Property__SelectorAssignment_3_1 ) )
            // InternalConfigurationLanguage.g:1501:2: ( rule__Property__SelectorAssignment_3_1 )
            {
             before(grammarAccess.getPropertyAccess().getSelectorAssignment_3_1()); 
            // InternalConfigurationLanguage.g:1502:2: ( rule__Property__SelectorAssignment_3_1 )
            // InternalConfigurationLanguage.g:1502:3: rule__Property__SelectorAssignment_3_1
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
    // InternalConfigurationLanguage.g:1511:1: rule__SiteStructure__TypeDefinitionsAssignment : ( ruleType ) ;
    public final void rule__SiteStructure__TypeDefinitionsAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConfigurationLanguage.g:1515:1: ( ( ruleType ) )
            // InternalConfigurationLanguage.g:1516:2: ( ruleType )
            {
            // InternalConfigurationLanguage.g:1516:2: ( ruleType )
            // InternalConfigurationLanguage.g:1517:3: ruleType
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
    // InternalConfigurationLanguage.g:1526:1: rule__ContentType__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__ContentType__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConfigurationLanguage.g:1530:1: ( ( RULE_ID ) )
            // InternalConfigurationLanguage.g:1531:2: ( RULE_ID )
            {
            // InternalConfigurationLanguage.g:1531:2: ( RULE_ID )
            // InternalConfigurationLanguage.g:1532:3: RULE_ID
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


    // $ANTLR start "rule__ContentType__SelectorAssignment_3_3"
    // InternalConfigurationLanguage.g:1541:1: rule__ContentType__SelectorAssignment_3_3 : ( ruleContentSelector ) ;
    public final void rule__ContentType__SelectorAssignment_3_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConfigurationLanguage.g:1545:1: ( ( ruleContentSelector ) )
            // InternalConfigurationLanguage.g:1546:2: ( ruleContentSelector )
            {
            // InternalConfigurationLanguage.g:1546:2: ( ruleContentSelector )
            // InternalConfigurationLanguage.g:1547:3: ruleContentSelector
            {
             before(grammarAccess.getContentTypeAccess().getSelectorContentSelectorParserRuleCall_3_3_0()); 
            pushFollow(FOLLOW_2);
            ruleContentSelector();

            state._fsp--;

             after(grammarAccess.getContentTypeAccess().getSelectorContentSelectorParserRuleCall_3_3_0()); 

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
    // $ANTLR end "rule__ContentType__SelectorAssignment_3_3"


    // $ANTLR start "rule__ContentType__PropertiesAssignment_4_1"
    // InternalConfigurationLanguage.g:1556:1: rule__ContentType__PropertiesAssignment_4_1 : ( ruleProperty ) ;
    public final void rule__ContentType__PropertiesAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConfigurationLanguage.g:1560:1: ( ( ruleProperty ) )
            // InternalConfigurationLanguage.g:1561:2: ( ruleProperty )
            {
            // InternalConfigurationLanguage.g:1561:2: ( ruleProperty )
            // InternalConfigurationLanguage.g:1562:3: ruleProperty
            {
             before(grammarAccess.getContentTypeAccess().getPropertiesPropertyParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleProperty();

            state._fsp--;

             after(grammarAccess.getContentTypeAccess().getPropertiesPropertyParserRuleCall_4_1_0()); 

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
    // $ANTLR end "rule__ContentType__PropertiesAssignment_4_1"


    // $ANTLR start "rule__ReferenceType__NameAssignment_2"
    // InternalConfigurationLanguage.g:1571:1: rule__ReferenceType__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__ReferenceType__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConfigurationLanguage.g:1575:1: ( ( RULE_ID ) )
            // InternalConfigurationLanguage.g:1576:2: ( RULE_ID )
            {
            // InternalConfigurationLanguage.g:1576:2: ( RULE_ID )
            // InternalConfigurationLanguage.g:1577:3: RULE_ID
            {
             before(grammarAccess.getReferenceTypeAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getReferenceTypeAccess().getNameIDTerminalRuleCall_2_0()); 

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
    // $ANTLR end "rule__ReferenceType__NameAssignment_2"


    // $ANTLR start "rule__ReferenceType__SelectorAssignment_3_3"
    // InternalConfigurationLanguage.g:1586:1: rule__ReferenceType__SelectorAssignment_3_3 : ( ruleContentSelector ) ;
    public final void rule__ReferenceType__SelectorAssignment_3_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConfigurationLanguage.g:1590:1: ( ( ruleContentSelector ) )
            // InternalConfigurationLanguage.g:1591:2: ( ruleContentSelector )
            {
            // InternalConfigurationLanguage.g:1591:2: ( ruleContentSelector )
            // InternalConfigurationLanguage.g:1592:3: ruleContentSelector
            {
             before(grammarAccess.getReferenceTypeAccess().getSelectorContentSelectorParserRuleCall_3_3_0()); 
            pushFollow(FOLLOW_2);
            ruleContentSelector();

            state._fsp--;

             after(grammarAccess.getReferenceTypeAccess().getSelectorContentSelectorParserRuleCall_3_3_0()); 

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
    // $ANTLR end "rule__ReferenceType__SelectorAssignment_3_3"


    // $ANTLR start "rule__ReferenceType__PropertiesAssignment_4_1"
    // InternalConfigurationLanguage.g:1601:1: rule__ReferenceType__PropertiesAssignment_4_1 : ( ruleProperty ) ;
    public final void rule__ReferenceType__PropertiesAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConfigurationLanguage.g:1605:1: ( ( ruleProperty ) )
            // InternalConfigurationLanguage.g:1606:2: ( ruleProperty )
            {
            // InternalConfigurationLanguage.g:1606:2: ( ruleProperty )
            // InternalConfigurationLanguage.g:1607:3: ruleProperty
            {
             before(grammarAccess.getReferenceTypeAccess().getPropertiesPropertyParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleProperty();

            state._fsp--;

             after(grammarAccess.getReferenceTypeAccess().getPropertiesPropertyParserRuleCall_4_1_0()); 

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
    // $ANTLR end "rule__ReferenceType__PropertiesAssignment_4_1"


    // $ANTLR start "rule__PageType__NameAssignment_2"
    // InternalConfigurationLanguage.g:1616:1: rule__PageType__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__PageType__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConfigurationLanguage.g:1620:1: ( ( RULE_ID ) )
            // InternalConfigurationLanguage.g:1621:2: ( RULE_ID )
            {
            // InternalConfigurationLanguage.g:1621:2: ( RULE_ID )
            // InternalConfigurationLanguage.g:1622:3: RULE_ID
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
    // InternalConfigurationLanguage.g:1631:1: rule__PageType__SelectorAssignment_6 : ( rulePageSelector ) ;
    public final void rule__PageType__SelectorAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConfigurationLanguage.g:1635:1: ( ( rulePageSelector ) )
            // InternalConfigurationLanguage.g:1636:2: ( rulePageSelector )
            {
            // InternalConfigurationLanguage.g:1636:2: ( rulePageSelector )
            // InternalConfigurationLanguage.g:1637:3: rulePageSelector
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
    // InternalConfigurationLanguage.g:1646:1: rule__PageType__PropertiesAssignment_7_1 : ( ruleProperty ) ;
    public final void rule__PageType__PropertiesAssignment_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConfigurationLanguage.g:1650:1: ( ( ruleProperty ) )
            // InternalConfigurationLanguage.g:1651:2: ( ruleProperty )
            {
            // InternalConfigurationLanguage.g:1651:2: ( ruleProperty )
            // InternalConfigurationLanguage.g:1652:3: ruleProperty
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
    // InternalConfigurationLanguage.g:1661:1: rule__CssSelector__DefinitionAssignment_1 : ( RULE_STRING ) ;
    public final void rule__CssSelector__DefinitionAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConfigurationLanguage.g:1665:1: ( ( RULE_STRING ) )
            // InternalConfigurationLanguage.g:1666:2: ( RULE_STRING )
            {
            // InternalConfigurationLanguage.g:1666:2: ( RULE_STRING )
            // InternalConfigurationLanguage.g:1667:3: RULE_STRING
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
    // InternalConfigurationLanguage.g:1676:1: rule__UrlPatternSelector__DefinitionAssignment_2 : ( RULE_STRING ) ;
    public final void rule__UrlPatternSelector__DefinitionAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConfigurationLanguage.g:1680:1: ( ( RULE_STRING ) )
            // InternalConfigurationLanguage.g:1681:2: ( RULE_STRING )
            {
            // InternalConfigurationLanguage.g:1681:2: ( RULE_STRING )
            // InternalConfigurationLanguage.g:1682:3: RULE_STRING
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
    // InternalConfigurationLanguage.g:1691:1: rule__Property__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__Property__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConfigurationLanguage.g:1695:1: ( ( RULE_ID ) )
            // InternalConfigurationLanguage.g:1696:2: ( RULE_ID )
            {
            // InternalConfigurationLanguage.g:1696:2: ( RULE_ID )
            // InternalConfigurationLanguage.g:1697:3: RULE_ID
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
    // InternalConfigurationLanguage.g:1706:1: rule__Property__TypeAssignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__Property__TypeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConfigurationLanguage.g:1710:1: ( ( ( RULE_ID ) ) )
            // InternalConfigurationLanguage.g:1711:2: ( ( RULE_ID ) )
            {
            // InternalConfigurationLanguage.g:1711:2: ( ( RULE_ID ) )
            // InternalConfigurationLanguage.g:1712:3: ( RULE_ID )
            {
             before(grammarAccess.getPropertyAccess().getTypeContentTypeCrossReference_2_0()); 
            // InternalConfigurationLanguage.g:1713:3: ( RULE_ID )
            // InternalConfigurationLanguage.g:1714:4: RULE_ID
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
    // InternalConfigurationLanguage.g:1725:1: rule__Property__SelectorAssignment_3_1 : ( ruleContentSelector ) ;
    public final void rule__Property__SelectorAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConfigurationLanguage.g:1729:1: ( ( ruleContentSelector ) )
            // InternalConfigurationLanguage.g:1730:2: ( ruleContentSelector )
            {
            // InternalConfigurationLanguage.g:1730:2: ( ruleContentSelector )
            // InternalConfigurationLanguage.g:1731:3: ruleContentSelector
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
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000060802L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000012000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000180000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000400000L});

}