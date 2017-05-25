package de.tgremple.siteanalyser.configuration.idea.parser.antlr.internal;

import org.eclipse.xtext.idea.parser.AbstractPsiAntlrParser;
import de.tgremple.siteanalyser.configuration.idea.lang.ConfigurationLanguageElementTypeProvider;
import org.eclipse.xtext.idea.parser.TokenTypeProvider;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import de.tgremple.siteanalyser.configuration.services.ConfigurationLanguageGrammarAccess;

import com.intellij.lang.PsiBuilder;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class PsiInternalConfigurationLanguageParser extends AbstractPsiAntlrParser {
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


        public PsiInternalConfigurationLanguageParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public PsiInternalConfigurationLanguageParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return PsiInternalConfigurationLanguageParser.tokenNames; }
    public String getGrammarFileName() { return "PsiInternalConfigurationLanguage.g"; }



    	protected ConfigurationLanguageGrammarAccess grammarAccess;

    	protected ConfigurationLanguageElementTypeProvider elementTypeProvider;

    	public PsiInternalConfigurationLanguageParser(PsiBuilder builder, TokenStream input, ConfigurationLanguageElementTypeProvider elementTypeProvider, ConfigurationLanguageGrammarAccess grammarAccess) {
    		this(input);
    		setPsiBuilder(builder);
    		this.grammarAccess = grammarAccess;
    		this.elementTypeProvider = elementTypeProvider;
    	}

    	@Override
    	protected String getFirstRuleName() {
    		return "SiteStructure";
    	}




    // $ANTLR start "entryRuleSiteStructure"
    // PsiInternalConfigurationLanguage.g:52:1: entryRuleSiteStructure returns [Boolean current=false] : iv_ruleSiteStructure= ruleSiteStructure EOF ;
    public final Boolean entryRuleSiteStructure() throws RecognitionException {
        Boolean current = false;

        Boolean iv_ruleSiteStructure = null;


        try {
            // PsiInternalConfigurationLanguage.g:52:55: (iv_ruleSiteStructure= ruleSiteStructure EOF )
            // PsiInternalConfigurationLanguage.g:53:2: iv_ruleSiteStructure= ruleSiteStructure EOF
            {
             markComposite(elementTypeProvider.getSiteStructureElementType()); 
            pushFollow(FOLLOW_1);
            iv_ruleSiteStructure=ruleSiteStructure();

            state._fsp--;

             current =iv_ruleSiteStructure; 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSiteStructure"


    // $ANTLR start "ruleSiteStructure"
    // PsiInternalConfigurationLanguage.g:59:1: ruleSiteStructure returns [Boolean current=false] : ( (lv_typeDefinitions_0_0= ruleType ) )* ;
    public final Boolean ruleSiteStructure() throws RecognitionException {
        Boolean current = false;

        Boolean lv_typeDefinitions_0_0 = null;


        try {
            // PsiInternalConfigurationLanguage.g:60:1: ( ( (lv_typeDefinitions_0_0= ruleType ) )* )
            // PsiInternalConfigurationLanguage.g:61:2: ( (lv_typeDefinitions_0_0= ruleType ) )*
            {
            // PsiInternalConfigurationLanguage.g:61:2: ( (lv_typeDefinitions_0_0= ruleType ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==11||LA1_0==17) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // PsiInternalConfigurationLanguage.g:62:3: (lv_typeDefinitions_0_0= ruleType )
            	    {
            	    // PsiInternalConfigurationLanguage.g:62:3: (lv_typeDefinitions_0_0= ruleType )
            	    // PsiInternalConfigurationLanguage.g:63:4: lv_typeDefinitions_0_0= ruleType
            	    {

            	    				markComposite(elementTypeProvider.getSiteStructure_TypeDefinitionsTypeParserRuleCall_0ElementType());
            	    			
            	    pushFollow(FOLLOW_3);
            	    lv_typeDefinitions_0_0=ruleType();

            	    state._fsp--;


            	    				doneComposite();
            	    				if(!current) {
            	    					associateWithSemanticElement();
            	    					current = true;
            	    				}
            	    			

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSiteStructure"


    // $ANTLR start "entryRuleType"
    // PsiInternalConfigurationLanguage.g:79:1: entryRuleType returns [Boolean current=false] : iv_ruleType= ruleType EOF ;
    public final Boolean entryRuleType() throws RecognitionException {
        Boolean current = false;

        Boolean iv_ruleType = null;


        try {
            // PsiInternalConfigurationLanguage.g:79:46: (iv_ruleType= ruleType EOF )
            // PsiInternalConfigurationLanguage.g:80:2: iv_ruleType= ruleType EOF
            {
             markComposite(elementTypeProvider.getTypeElementType()); 
            pushFollow(FOLLOW_1);
            iv_ruleType=ruleType();

            state._fsp--;

             current =iv_ruleType; 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleType"


    // $ANTLR start "ruleType"
    // PsiInternalConfigurationLanguage.g:86:1: ruleType returns [Boolean current=false] : (this_ContentType_0= ruleContentType | this_PageType_1= rulePageType ) ;
    public final Boolean ruleType() throws RecognitionException {
        Boolean current = false;

        Boolean this_ContentType_0 = null;

        Boolean this_PageType_1 = null;


        try {
            // PsiInternalConfigurationLanguage.g:87:1: ( (this_ContentType_0= ruleContentType | this_PageType_1= rulePageType ) )
            // PsiInternalConfigurationLanguage.g:88:2: (this_ContentType_0= ruleContentType | this_PageType_1= rulePageType )
            {
            // PsiInternalConfigurationLanguage.g:88:2: (this_ContentType_0= ruleContentType | this_PageType_1= rulePageType )
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
                    // PsiInternalConfigurationLanguage.g:89:3: this_ContentType_0= ruleContentType
                    {

                    			markComposite(elementTypeProvider.getType_ContentTypeParserRuleCall_0ElementType());
                    		
                    pushFollow(FOLLOW_2);
                    this_ContentType_0=ruleContentType();

                    state._fsp--;


                    			current = this_ContentType_0;
                    			doneComposite();
                    		

                    }
                    break;
                case 2 :
                    // PsiInternalConfigurationLanguage.g:98:3: this_PageType_1= rulePageType
                    {

                    			markComposite(elementTypeProvider.getType_PageTypeParserRuleCall_1ElementType());
                    		
                    pushFollow(FOLLOW_2);
                    this_PageType_1=rulePageType();

                    state._fsp--;


                    			current = this_PageType_1;
                    			doneComposite();
                    		

                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleType"


    // $ANTLR start "entryRuleContentType"
    // PsiInternalConfigurationLanguage.g:110:1: entryRuleContentType returns [Boolean current=false] : iv_ruleContentType= ruleContentType EOF ;
    public final Boolean entryRuleContentType() throws RecognitionException {
        Boolean current = false;

        Boolean iv_ruleContentType = null;


        try {
            // PsiInternalConfigurationLanguage.g:110:53: (iv_ruleContentType= ruleContentType EOF )
            // PsiInternalConfigurationLanguage.g:111:2: iv_ruleContentType= ruleContentType EOF
            {
             markComposite(elementTypeProvider.getContentTypeElementType()); 
            pushFollow(FOLLOW_1);
            iv_ruleContentType=ruleContentType();

            state._fsp--;

             current =iv_ruleContentType; 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleContentType"


    // $ANTLR start "ruleContentType"
    // PsiInternalConfigurationLanguage.g:117:1: ruleContentType returns [Boolean current=false] : (otherlv_0= 'content' otherlv_1= 'type' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'is' otherlv_4= 'recognized' otherlv_5= 'by' ( (lv_selector_6_0= ruleContentSelector ) ) )? (otherlv_7= 'recognize' ( (lv_properties_8_0= ruleProperty ) )* )? ) ;
    public final Boolean ruleContentType() throws RecognitionException {
        Boolean current = false;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Boolean lv_selector_6_0 = null;

        Boolean lv_properties_8_0 = null;


        try {
            // PsiInternalConfigurationLanguage.g:118:1: ( (otherlv_0= 'content' otherlv_1= 'type' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'is' otherlv_4= 'recognized' otherlv_5= 'by' ( (lv_selector_6_0= ruleContentSelector ) ) )? (otherlv_7= 'recognize' ( (lv_properties_8_0= ruleProperty ) )* )? ) )
            // PsiInternalConfigurationLanguage.g:119:2: (otherlv_0= 'content' otherlv_1= 'type' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'is' otherlv_4= 'recognized' otherlv_5= 'by' ( (lv_selector_6_0= ruleContentSelector ) ) )? (otherlv_7= 'recognize' ( (lv_properties_8_0= ruleProperty ) )* )? )
            {
            // PsiInternalConfigurationLanguage.g:119:2: (otherlv_0= 'content' otherlv_1= 'type' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'is' otherlv_4= 'recognized' otherlv_5= 'by' ( (lv_selector_6_0= ruleContentSelector ) ) )? (otherlv_7= 'recognize' ( (lv_properties_8_0= ruleProperty ) )* )? )
            // PsiInternalConfigurationLanguage.g:120:3: otherlv_0= 'content' otherlv_1= 'type' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'is' otherlv_4= 'recognized' otherlv_5= 'by' ( (lv_selector_6_0= ruleContentSelector ) ) )? (otherlv_7= 'recognize' ( (lv_properties_8_0= ruleProperty ) )* )?
            {

            			markLeaf(elementTypeProvider.getContentType_ContentKeyword_0ElementType());
            		
            otherlv_0=(Token)match(input,11,FOLLOW_4); 

            			doneLeaf(otherlv_0);
            		

            			markLeaf(elementTypeProvider.getContentType_TypeKeyword_1ElementType());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_5); 

            			doneLeaf(otherlv_1);
            		
            // PsiInternalConfigurationLanguage.g:134:3: ( (lv_name_2_0= RULE_ID ) )
            // PsiInternalConfigurationLanguage.g:135:4: (lv_name_2_0= RULE_ID )
            {
            // PsiInternalConfigurationLanguage.g:135:4: (lv_name_2_0= RULE_ID )
            // PsiInternalConfigurationLanguage.g:136:5: lv_name_2_0= RULE_ID
            {

            					markLeaf(elementTypeProvider.getContentType_NameIDTerminalRuleCall_2_0ElementType());
            				
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_6); 

            					if(!current) {
            						associateWithSemanticElement();
            						current = true;
            					}
            				

            					doneLeaf(lv_name_2_0);
            				

            }


            }

            // PsiInternalConfigurationLanguage.g:151:3: (otherlv_3= 'is' otherlv_4= 'recognized' otherlv_5= 'by' ( (lv_selector_6_0= ruleContentSelector ) ) )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==13) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // PsiInternalConfigurationLanguage.g:152:4: otherlv_3= 'is' otherlv_4= 'recognized' otherlv_5= 'by' ( (lv_selector_6_0= ruleContentSelector ) )
                    {

                    				markLeaf(elementTypeProvider.getContentType_IsKeyword_3_0ElementType());
                    			
                    otherlv_3=(Token)match(input,13,FOLLOW_7); 

                    				doneLeaf(otherlv_3);
                    			

                    				markLeaf(elementTypeProvider.getContentType_RecognizedKeyword_3_1ElementType());
                    			
                    otherlv_4=(Token)match(input,14,FOLLOW_8); 

                    				doneLeaf(otherlv_4);
                    			

                    				markLeaf(elementTypeProvider.getContentType_ByKeyword_3_2ElementType());
                    			
                    otherlv_5=(Token)match(input,15,FOLLOW_9); 

                    				doneLeaf(otherlv_5);
                    			
                    // PsiInternalConfigurationLanguage.g:173:4: ( (lv_selector_6_0= ruleContentSelector ) )
                    // PsiInternalConfigurationLanguage.g:174:5: (lv_selector_6_0= ruleContentSelector )
                    {
                    // PsiInternalConfigurationLanguage.g:174:5: (lv_selector_6_0= ruleContentSelector )
                    // PsiInternalConfigurationLanguage.g:175:6: lv_selector_6_0= ruleContentSelector
                    {

                    						markComposite(elementTypeProvider.getContentType_SelectorContentSelectorParserRuleCall_3_3_0ElementType());
                    					
                    pushFollow(FOLLOW_10);
                    lv_selector_6_0=ruleContentSelector();

                    state._fsp--;


                    						doneComposite();
                    						if(!current) {
                    							associateWithSemanticElement();
                    							current = true;
                    						}
                    					

                    }


                    }


                    }
                    break;

            }

            // PsiInternalConfigurationLanguage.g:189:3: (otherlv_7= 'recognize' ( (lv_properties_8_0= ruleProperty ) )* )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==16) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // PsiInternalConfigurationLanguage.g:190:4: otherlv_7= 'recognize' ( (lv_properties_8_0= ruleProperty ) )*
                    {

                    				markLeaf(elementTypeProvider.getContentType_RecognizeKeyword_4_0ElementType());
                    			
                    otherlv_7=(Token)match(input,16,FOLLOW_11); 

                    				doneLeaf(otherlv_7);
                    			
                    // PsiInternalConfigurationLanguage.g:197:4: ( (lv_properties_8_0= ruleProperty ) )*
                    loop4:
                    do {
                        int alt4=2;
                        int LA4_0 = input.LA(1);

                        if ( (LA4_0==RULE_ID) ) {
                            alt4=1;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // PsiInternalConfigurationLanguage.g:198:5: (lv_properties_8_0= ruleProperty )
                    	    {
                    	    // PsiInternalConfigurationLanguage.g:198:5: (lv_properties_8_0= ruleProperty )
                    	    // PsiInternalConfigurationLanguage.g:199:6: lv_properties_8_0= ruleProperty
                    	    {

                    	    						markComposite(elementTypeProvider.getContentType_PropertiesPropertyParserRuleCall_4_1_0ElementType());
                    	    					
                    	    pushFollow(FOLLOW_11);
                    	    lv_properties_8_0=ruleProperty();

                    	    state._fsp--;


                    	    						doneComposite();
                    	    						if(!current) {
                    	    							associateWithSemanticElement();
                    	    							current = true;
                    	    						}
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop4;
                        }
                    } while (true);


                    }
                    break;

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleContentType"


    // $ANTLR start "entryRulePageType"
    // PsiInternalConfigurationLanguage.g:217:1: entryRulePageType returns [Boolean current=false] : iv_rulePageType= rulePageType EOF ;
    public final Boolean entryRulePageType() throws RecognitionException {
        Boolean current = false;

        Boolean iv_rulePageType = null;


        try {
            // PsiInternalConfigurationLanguage.g:217:50: (iv_rulePageType= rulePageType EOF )
            // PsiInternalConfigurationLanguage.g:218:2: iv_rulePageType= rulePageType EOF
            {
             markComposite(elementTypeProvider.getPageTypeElementType()); 
            pushFollow(FOLLOW_1);
            iv_rulePageType=rulePageType();

            state._fsp--;

             current =iv_rulePageType; 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePageType"


    // $ANTLR start "rulePageType"
    // PsiInternalConfigurationLanguage.g:224:1: rulePageType returns [Boolean current=false] : (otherlv_0= 'page' otherlv_1= 'type' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= 'is' otherlv_4= 'recognized' otherlv_5= 'by' ( (lv_selector_6_0= rulePageSelector ) ) (otherlv_7= 'recognize' ( (lv_properties_8_0= ruleProperty ) )* )? ) ;
    public final Boolean rulePageType() throws RecognitionException {
        Boolean current = false;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Boolean lv_selector_6_0 = null;

        Boolean lv_properties_8_0 = null;


        try {
            // PsiInternalConfigurationLanguage.g:225:1: ( (otherlv_0= 'page' otherlv_1= 'type' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= 'is' otherlv_4= 'recognized' otherlv_5= 'by' ( (lv_selector_6_0= rulePageSelector ) ) (otherlv_7= 'recognize' ( (lv_properties_8_0= ruleProperty ) )* )? ) )
            // PsiInternalConfigurationLanguage.g:226:2: (otherlv_0= 'page' otherlv_1= 'type' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= 'is' otherlv_4= 'recognized' otherlv_5= 'by' ( (lv_selector_6_0= rulePageSelector ) ) (otherlv_7= 'recognize' ( (lv_properties_8_0= ruleProperty ) )* )? )
            {
            // PsiInternalConfigurationLanguage.g:226:2: (otherlv_0= 'page' otherlv_1= 'type' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= 'is' otherlv_4= 'recognized' otherlv_5= 'by' ( (lv_selector_6_0= rulePageSelector ) ) (otherlv_7= 'recognize' ( (lv_properties_8_0= ruleProperty ) )* )? )
            // PsiInternalConfigurationLanguage.g:227:3: otherlv_0= 'page' otherlv_1= 'type' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= 'is' otherlv_4= 'recognized' otherlv_5= 'by' ( (lv_selector_6_0= rulePageSelector ) ) (otherlv_7= 'recognize' ( (lv_properties_8_0= ruleProperty ) )* )?
            {

            			markLeaf(elementTypeProvider.getPageType_PageKeyword_0ElementType());
            		
            otherlv_0=(Token)match(input,17,FOLLOW_4); 

            			doneLeaf(otherlv_0);
            		

            			markLeaf(elementTypeProvider.getPageType_TypeKeyword_1ElementType());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_5); 

            			doneLeaf(otherlv_1);
            		
            // PsiInternalConfigurationLanguage.g:241:3: ( (lv_name_2_0= RULE_ID ) )
            // PsiInternalConfigurationLanguage.g:242:4: (lv_name_2_0= RULE_ID )
            {
            // PsiInternalConfigurationLanguage.g:242:4: (lv_name_2_0= RULE_ID )
            // PsiInternalConfigurationLanguage.g:243:5: lv_name_2_0= RULE_ID
            {

            					markLeaf(elementTypeProvider.getPageType_NameIDTerminalRuleCall_2_0ElementType());
            				
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_12); 

            					if(!current) {
            						associateWithSemanticElement();
            						current = true;
            					}
            				

            					doneLeaf(lv_name_2_0);
            				

            }


            }


            			markLeaf(elementTypeProvider.getPageType_IsKeyword_3ElementType());
            		
            otherlv_3=(Token)match(input,13,FOLLOW_7); 

            			doneLeaf(otherlv_3);
            		

            			markLeaf(elementTypeProvider.getPageType_RecognizedKeyword_4ElementType());
            		
            otherlv_4=(Token)match(input,14,FOLLOW_8); 

            			doneLeaf(otherlv_4);
            		

            			markLeaf(elementTypeProvider.getPageType_ByKeyword_5ElementType());
            		
            otherlv_5=(Token)match(input,15,FOLLOW_13); 

            			doneLeaf(otherlv_5);
            		
            // PsiInternalConfigurationLanguage.g:279:3: ( (lv_selector_6_0= rulePageSelector ) )
            // PsiInternalConfigurationLanguage.g:280:4: (lv_selector_6_0= rulePageSelector )
            {
            // PsiInternalConfigurationLanguage.g:280:4: (lv_selector_6_0= rulePageSelector )
            // PsiInternalConfigurationLanguage.g:281:5: lv_selector_6_0= rulePageSelector
            {

            					markComposite(elementTypeProvider.getPageType_SelectorPageSelectorParserRuleCall_6_0ElementType());
            				
            pushFollow(FOLLOW_10);
            lv_selector_6_0=rulePageSelector();

            state._fsp--;


            					doneComposite();
            					if(!current) {
            						associateWithSemanticElement();
            						current = true;
            					}
            				

            }


            }

            // PsiInternalConfigurationLanguage.g:294:3: (otherlv_7= 'recognize' ( (lv_properties_8_0= ruleProperty ) )* )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==16) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // PsiInternalConfigurationLanguage.g:295:4: otherlv_7= 'recognize' ( (lv_properties_8_0= ruleProperty ) )*
                    {

                    				markLeaf(elementTypeProvider.getPageType_RecognizeKeyword_7_0ElementType());
                    			
                    otherlv_7=(Token)match(input,16,FOLLOW_11); 

                    				doneLeaf(otherlv_7);
                    			
                    // PsiInternalConfigurationLanguage.g:302:4: ( (lv_properties_8_0= ruleProperty ) )*
                    loop6:
                    do {
                        int alt6=2;
                        int LA6_0 = input.LA(1);

                        if ( (LA6_0==RULE_ID) ) {
                            alt6=1;
                        }


                        switch (alt6) {
                    	case 1 :
                    	    // PsiInternalConfigurationLanguage.g:303:5: (lv_properties_8_0= ruleProperty )
                    	    {
                    	    // PsiInternalConfigurationLanguage.g:303:5: (lv_properties_8_0= ruleProperty )
                    	    // PsiInternalConfigurationLanguage.g:304:6: lv_properties_8_0= ruleProperty
                    	    {

                    	    						markComposite(elementTypeProvider.getPageType_PropertiesPropertyParserRuleCall_7_1_0ElementType());
                    	    					
                    	    pushFollow(FOLLOW_11);
                    	    lv_properties_8_0=ruleProperty();

                    	    state._fsp--;


                    	    						doneComposite();
                    	    						if(!current) {
                    	    							associateWithSemanticElement();
                    	    							current = true;
                    	    						}
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop6;
                        }
                    } while (true);


                    }
                    break;

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePageType"


    // $ANTLR start "entryRuleContentSelector"
    // PsiInternalConfigurationLanguage.g:322:1: entryRuleContentSelector returns [Boolean current=false] : iv_ruleContentSelector= ruleContentSelector EOF ;
    public final Boolean entryRuleContentSelector() throws RecognitionException {
        Boolean current = false;

        Boolean iv_ruleContentSelector = null;


        try {
            // PsiInternalConfigurationLanguage.g:322:57: (iv_ruleContentSelector= ruleContentSelector EOF )
            // PsiInternalConfigurationLanguage.g:323:2: iv_ruleContentSelector= ruleContentSelector EOF
            {
             markComposite(elementTypeProvider.getContentSelectorElementType()); 
            pushFollow(FOLLOW_1);
            iv_ruleContentSelector=ruleContentSelector();

            state._fsp--;

             current =iv_ruleContentSelector; 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleContentSelector"


    // $ANTLR start "ruleContentSelector"
    // PsiInternalConfigurationLanguage.g:329:1: ruleContentSelector returns [Boolean current=false] : this_CssSelector_0= ruleCssSelector ;
    public final Boolean ruleContentSelector() throws RecognitionException {
        Boolean current = false;

        Boolean this_CssSelector_0 = null;


        try {
            // PsiInternalConfigurationLanguage.g:330:1: (this_CssSelector_0= ruleCssSelector )
            // PsiInternalConfigurationLanguage.g:331:2: this_CssSelector_0= ruleCssSelector
            {

            		markComposite(elementTypeProvider.getContentSelector_CssSelectorParserRuleCallElementType());
            	
            pushFollow(FOLLOW_2);
            this_CssSelector_0=ruleCssSelector();

            state._fsp--;


            		current = this_CssSelector_0;
            		doneComposite();
            	

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleContentSelector"


    // $ANTLR start "entryRulePageSelector"
    // PsiInternalConfigurationLanguage.g:342:1: entryRulePageSelector returns [Boolean current=false] : iv_rulePageSelector= rulePageSelector EOF ;
    public final Boolean entryRulePageSelector() throws RecognitionException {
        Boolean current = false;

        Boolean iv_rulePageSelector = null;


        try {
            // PsiInternalConfigurationLanguage.g:342:54: (iv_rulePageSelector= rulePageSelector EOF )
            // PsiInternalConfigurationLanguage.g:343:2: iv_rulePageSelector= rulePageSelector EOF
            {
             markComposite(elementTypeProvider.getPageSelectorElementType()); 
            pushFollow(FOLLOW_1);
            iv_rulePageSelector=rulePageSelector();

            state._fsp--;

             current =iv_rulePageSelector; 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePageSelector"


    // $ANTLR start "rulePageSelector"
    // PsiInternalConfigurationLanguage.g:349:1: rulePageSelector returns [Boolean current=false] : (this_CssSelector_0= ruleCssSelector | this_UrlPatternSelector_1= ruleUrlPatternSelector ) ;
    public final Boolean rulePageSelector() throws RecognitionException {
        Boolean current = false;

        Boolean this_CssSelector_0 = null;

        Boolean this_UrlPatternSelector_1 = null;


        try {
            // PsiInternalConfigurationLanguage.g:350:1: ( (this_CssSelector_0= ruleCssSelector | this_UrlPatternSelector_1= ruleUrlPatternSelector ) )
            // PsiInternalConfigurationLanguage.g:351:2: (this_CssSelector_0= ruleCssSelector | this_UrlPatternSelector_1= ruleUrlPatternSelector )
            {
            // PsiInternalConfigurationLanguage.g:351:2: (this_CssSelector_0= ruleCssSelector | this_UrlPatternSelector_1= ruleUrlPatternSelector )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==18) ) {
                alt8=1;
            }
            else if ( (LA8_0==19) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // PsiInternalConfigurationLanguage.g:352:3: this_CssSelector_0= ruleCssSelector
                    {

                    			markComposite(elementTypeProvider.getPageSelector_CssSelectorParserRuleCall_0ElementType());
                    		
                    pushFollow(FOLLOW_2);
                    this_CssSelector_0=ruleCssSelector();

                    state._fsp--;


                    			current = this_CssSelector_0;
                    			doneComposite();
                    		

                    }
                    break;
                case 2 :
                    // PsiInternalConfigurationLanguage.g:361:3: this_UrlPatternSelector_1= ruleUrlPatternSelector
                    {

                    			markComposite(elementTypeProvider.getPageSelector_UrlPatternSelectorParserRuleCall_1ElementType());
                    		
                    pushFollow(FOLLOW_2);
                    this_UrlPatternSelector_1=ruleUrlPatternSelector();

                    state._fsp--;


                    			current = this_UrlPatternSelector_1;
                    			doneComposite();
                    		

                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePageSelector"


    // $ANTLR start "entryRuleCssSelector"
    // PsiInternalConfigurationLanguage.g:373:1: entryRuleCssSelector returns [Boolean current=false] : iv_ruleCssSelector= ruleCssSelector EOF ;
    public final Boolean entryRuleCssSelector() throws RecognitionException {
        Boolean current = false;

        Boolean iv_ruleCssSelector = null;


        try {
            // PsiInternalConfigurationLanguage.g:373:53: (iv_ruleCssSelector= ruleCssSelector EOF )
            // PsiInternalConfigurationLanguage.g:374:2: iv_ruleCssSelector= ruleCssSelector EOF
            {
             markComposite(elementTypeProvider.getCssSelectorElementType()); 
            pushFollow(FOLLOW_1);
            iv_ruleCssSelector=ruleCssSelector();

            state._fsp--;

             current =iv_ruleCssSelector; 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCssSelector"


    // $ANTLR start "ruleCssSelector"
    // PsiInternalConfigurationLanguage.g:380:1: ruleCssSelector returns [Boolean current=false] : (otherlv_0= 'css' ( (lv_definition_1_0= RULE_STRING ) ) ) ;
    public final Boolean ruleCssSelector() throws RecognitionException {
        Boolean current = false;

        Token otherlv_0=null;
        Token lv_definition_1_0=null;

        try {
            // PsiInternalConfigurationLanguage.g:381:1: ( (otherlv_0= 'css' ( (lv_definition_1_0= RULE_STRING ) ) ) )
            // PsiInternalConfigurationLanguage.g:382:2: (otherlv_0= 'css' ( (lv_definition_1_0= RULE_STRING ) ) )
            {
            // PsiInternalConfigurationLanguage.g:382:2: (otherlv_0= 'css' ( (lv_definition_1_0= RULE_STRING ) ) )
            // PsiInternalConfigurationLanguage.g:383:3: otherlv_0= 'css' ( (lv_definition_1_0= RULE_STRING ) )
            {

            			markLeaf(elementTypeProvider.getCssSelector_CssKeyword_0ElementType());
            		
            otherlv_0=(Token)match(input,18,FOLLOW_14); 

            			doneLeaf(otherlv_0);
            		
            // PsiInternalConfigurationLanguage.g:390:3: ( (lv_definition_1_0= RULE_STRING ) )
            // PsiInternalConfigurationLanguage.g:391:4: (lv_definition_1_0= RULE_STRING )
            {
            // PsiInternalConfigurationLanguage.g:391:4: (lv_definition_1_0= RULE_STRING )
            // PsiInternalConfigurationLanguage.g:392:5: lv_definition_1_0= RULE_STRING
            {

            					markLeaf(elementTypeProvider.getCssSelector_DefinitionSTRINGTerminalRuleCall_1_0ElementType());
            				
            lv_definition_1_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            					if(!current) {
            						associateWithSemanticElement();
            						current = true;
            					}
            				

            					doneLeaf(lv_definition_1_0);
            				

            }


            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCssSelector"


    // $ANTLR start "entryRuleUrlPatternSelector"
    // PsiInternalConfigurationLanguage.g:411:1: entryRuleUrlPatternSelector returns [Boolean current=false] : iv_ruleUrlPatternSelector= ruleUrlPatternSelector EOF ;
    public final Boolean entryRuleUrlPatternSelector() throws RecognitionException {
        Boolean current = false;

        Boolean iv_ruleUrlPatternSelector = null;


        try {
            // PsiInternalConfigurationLanguage.g:411:60: (iv_ruleUrlPatternSelector= ruleUrlPatternSelector EOF )
            // PsiInternalConfigurationLanguage.g:412:2: iv_ruleUrlPatternSelector= ruleUrlPatternSelector EOF
            {
             markComposite(elementTypeProvider.getUrlPatternSelectorElementType()); 
            pushFollow(FOLLOW_1);
            iv_ruleUrlPatternSelector=ruleUrlPatternSelector();

            state._fsp--;

             current =iv_ruleUrlPatternSelector; 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleUrlPatternSelector"


    // $ANTLR start "ruleUrlPatternSelector"
    // PsiInternalConfigurationLanguage.g:418:1: ruleUrlPatternSelector returns [Boolean current=false] : (otherlv_0= 'url' otherlv_1= 'pattern' ( (lv_definition_2_0= RULE_STRING ) ) ) ;
    public final Boolean ruleUrlPatternSelector() throws RecognitionException {
        Boolean current = false;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_definition_2_0=null;

        try {
            // PsiInternalConfigurationLanguage.g:419:1: ( (otherlv_0= 'url' otherlv_1= 'pattern' ( (lv_definition_2_0= RULE_STRING ) ) ) )
            // PsiInternalConfigurationLanguage.g:420:2: (otherlv_0= 'url' otherlv_1= 'pattern' ( (lv_definition_2_0= RULE_STRING ) ) )
            {
            // PsiInternalConfigurationLanguage.g:420:2: (otherlv_0= 'url' otherlv_1= 'pattern' ( (lv_definition_2_0= RULE_STRING ) ) )
            // PsiInternalConfigurationLanguage.g:421:3: otherlv_0= 'url' otherlv_1= 'pattern' ( (lv_definition_2_0= RULE_STRING ) )
            {

            			markLeaf(elementTypeProvider.getUrlPatternSelector_UrlKeyword_0ElementType());
            		
            otherlv_0=(Token)match(input,19,FOLLOW_15); 

            			doneLeaf(otherlv_0);
            		

            			markLeaf(elementTypeProvider.getUrlPatternSelector_PatternKeyword_1ElementType());
            		
            otherlv_1=(Token)match(input,20,FOLLOW_14); 

            			doneLeaf(otherlv_1);
            		
            // PsiInternalConfigurationLanguage.g:435:3: ( (lv_definition_2_0= RULE_STRING ) )
            // PsiInternalConfigurationLanguage.g:436:4: (lv_definition_2_0= RULE_STRING )
            {
            // PsiInternalConfigurationLanguage.g:436:4: (lv_definition_2_0= RULE_STRING )
            // PsiInternalConfigurationLanguage.g:437:5: lv_definition_2_0= RULE_STRING
            {

            					markLeaf(elementTypeProvider.getUrlPatternSelector_DefinitionSTRINGTerminalRuleCall_2_0ElementType());
            				
            lv_definition_2_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            					if(!current) {
            						associateWithSemanticElement();
            						current = true;
            					}
            				

            					doneLeaf(lv_definition_2_0);
            				

            }


            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleUrlPatternSelector"


    // $ANTLR start "entryRuleProperty"
    // PsiInternalConfigurationLanguage.g:456:1: entryRuleProperty returns [Boolean current=false] : iv_ruleProperty= ruleProperty EOF ;
    public final Boolean entryRuleProperty() throws RecognitionException {
        Boolean current = false;

        Boolean iv_ruleProperty = null;


        try {
            // PsiInternalConfigurationLanguage.g:456:50: (iv_ruleProperty= ruleProperty EOF )
            // PsiInternalConfigurationLanguage.g:457:2: iv_ruleProperty= ruleProperty EOF
            {
             markComposite(elementTypeProvider.getPropertyElementType()); 
            pushFollow(FOLLOW_1);
            iv_ruleProperty=ruleProperty();

            state._fsp--;

             current =iv_ruleProperty; 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleProperty"


    // $ANTLR start "ruleProperty"
    // PsiInternalConfigurationLanguage.g:463:1: ruleProperty returns [Boolean current=false] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= 'as' ( (otherlv_2= RULE_ID ) ) (otherlv_3= 'by' ( (lv_selector_4_0= ruleContentSelector ) ) )? ) ;
    public final Boolean ruleProperty() throws RecognitionException {
        Boolean current = false;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Boolean lv_selector_4_0 = null;


        try {
            // PsiInternalConfigurationLanguage.g:464:1: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= 'as' ( (otherlv_2= RULE_ID ) ) (otherlv_3= 'by' ( (lv_selector_4_0= ruleContentSelector ) ) )? ) )
            // PsiInternalConfigurationLanguage.g:465:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= 'as' ( (otherlv_2= RULE_ID ) ) (otherlv_3= 'by' ( (lv_selector_4_0= ruleContentSelector ) ) )? )
            {
            // PsiInternalConfigurationLanguage.g:465:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= 'as' ( (otherlv_2= RULE_ID ) ) (otherlv_3= 'by' ( (lv_selector_4_0= ruleContentSelector ) ) )? )
            // PsiInternalConfigurationLanguage.g:466:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= 'as' ( (otherlv_2= RULE_ID ) ) (otherlv_3= 'by' ( (lv_selector_4_0= ruleContentSelector ) ) )?
            {
            // PsiInternalConfigurationLanguage.g:466:3: ( (lv_name_0_0= RULE_ID ) )
            // PsiInternalConfigurationLanguage.g:467:4: (lv_name_0_0= RULE_ID )
            {
            // PsiInternalConfigurationLanguage.g:467:4: (lv_name_0_0= RULE_ID )
            // PsiInternalConfigurationLanguage.g:468:5: lv_name_0_0= RULE_ID
            {

            					markLeaf(elementTypeProvider.getProperty_NameIDTerminalRuleCall_0_0ElementType());
            				
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_16); 

            					if(!current) {
            						associateWithSemanticElement();
            						current = true;
            					}
            				

            					doneLeaf(lv_name_0_0);
            				

            }


            }


            			markLeaf(elementTypeProvider.getProperty_AsKeyword_1ElementType());
            		
            otherlv_1=(Token)match(input,21,FOLLOW_5); 

            			doneLeaf(otherlv_1);
            		
            // PsiInternalConfigurationLanguage.g:490:3: ( (otherlv_2= RULE_ID ) )
            // PsiInternalConfigurationLanguage.g:491:4: (otherlv_2= RULE_ID )
            {
            // PsiInternalConfigurationLanguage.g:491:4: (otherlv_2= RULE_ID )
            // PsiInternalConfigurationLanguage.g:492:5: otherlv_2= RULE_ID
            {

            					if (!current) {
            						associateWithSemanticElement();
            						current = true;
            					}
            				

            					markLeaf(elementTypeProvider.getProperty_TypeContentTypeCrossReference_2_0ElementType());
            				
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_17); 

            					doneLeaf(otherlv_2);
            				

            }


            }

            // PsiInternalConfigurationLanguage.g:507:3: (otherlv_3= 'by' ( (lv_selector_4_0= ruleContentSelector ) ) )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==15) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // PsiInternalConfigurationLanguage.g:508:4: otherlv_3= 'by' ( (lv_selector_4_0= ruleContentSelector ) )
                    {

                    				markLeaf(elementTypeProvider.getProperty_ByKeyword_3_0ElementType());
                    			
                    otherlv_3=(Token)match(input,15,FOLLOW_9); 

                    				doneLeaf(otherlv_3);
                    			
                    // PsiInternalConfigurationLanguage.g:515:4: ( (lv_selector_4_0= ruleContentSelector ) )
                    // PsiInternalConfigurationLanguage.g:516:5: (lv_selector_4_0= ruleContentSelector )
                    {
                    // PsiInternalConfigurationLanguage.g:516:5: (lv_selector_4_0= ruleContentSelector )
                    // PsiInternalConfigurationLanguage.g:517:6: lv_selector_4_0= ruleContentSelector
                    {

                    						markComposite(elementTypeProvider.getProperty_SelectorContentSelectorParserRuleCall_3_1_0ElementType());
                    					
                    pushFollow(FOLLOW_2);
                    lv_selector_4_0=ruleContentSelector();

                    state._fsp--;


                    						doneComposite();
                    						if(!current) {
                    							associateWithSemanticElement();
                    							current = true;
                    						}
                    					

                    }


                    }


                    }
                    break;

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleProperty"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000020802L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000012002L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x00000000000C0000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000008002L});

}