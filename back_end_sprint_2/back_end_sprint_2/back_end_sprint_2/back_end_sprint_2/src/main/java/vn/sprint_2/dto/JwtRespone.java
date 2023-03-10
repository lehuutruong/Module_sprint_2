package vn.sprint_2.dto;

import org.springframework.security.core.GrantedAuthority;
import vn.sprint_2.model.account.Account;
import vn.sprint_2.model.users.User;

import java.util.Collection;

public class JwtRespone {

    private String token;
    private String type = "Bearer";
    private Account account;
    private Collection<? extends GrantedAuthority> roles;

    public JwtRespone() {
    }

    public JwtRespone(String token, Collection<? extends GrantedAuthority> authorities, Account account) {
        this.token = token;
        this.roles = authorities;
        this.account = account;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    public Collection<? extends GrantedAuthority> getRoles() {
        return roles;
    }

    public void setRoles(Collection<? extends GrantedAuthority> roles) {
        this.roles = roles;
    }
}